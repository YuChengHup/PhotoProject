package com.dao.Impl;

import com.dao.EmpDao;
import com.domain.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-23 19:33
 **/
@Repository
public class EmpDaoImpl implements EmpDao {
    @Autowired private JdbcTemplate jd;
    @Override
    public Emp findEmpByUsername(String username) {
        Object[] objs={username};
        try {
            Emp emp = jd.queryForObject("select * from emp where username=?", objs, new BeanPropertyRowMapper<Emp>(Emp.class));
            return emp;
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public int addEmp(Emp emp) {
        Object[] objs={emp.getE_name(),emp.getE_sex(),emp.getE_tell(),emp.getUsername(),emp.getPasswd()};
        int i = jd.update("insert into emp values (null,?,?,?,?,?)", objs);
        return i;
    }

    @Override
    public int updatePasswordByUsername(String username,String passwd) {
        Object[] objs={passwd,username};
        int i = jd.update("update emp set passwd=? where username=?", objs);
        return i;
    }
}
