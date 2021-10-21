package com.dao;

import com.domain.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-23 19:18
 **/

public interface EmpDao {
    /**
     * 通过用户名查找用户信息
     */
    Emp findEmpByUsername(String username);

    /**
     * 添加用户信息
     */
    int addEmp(Emp emp);

    /**
     * 修改密码
     */
    int updatePasswordByUsername(String username,String passwd);
}
