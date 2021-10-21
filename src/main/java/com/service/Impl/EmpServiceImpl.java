package com.service.Impl;

import com.dao.EmpDao;
import com.domain.Emp;
import com.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-23 19:40
 **/
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired private EmpDao empDao;
    @Override
    public int login(String username, String passwd) {
        Emp emp = empDao.findEmpByUsername(username);
        if (emp==null){
//            用户名不存在
            return 3;
        }
        if (emp.getPasswd().equals(passwd)){
//            登录成功
            return 2;
        }
//        密码错误
        return 1;
    }

    @Override
    public int addEmp(Emp emp) {
        int i = empDao.addEmp(emp);
        return i;
    }

    @Override
    public int updatePasswordByUsername(String username, String passwd) {
        int i = empDao.updatePasswordByUsername(username, passwd);
        return i;
    }
}
