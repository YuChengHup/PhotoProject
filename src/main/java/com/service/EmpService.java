package com.service;

import com.domain.Emp;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-23 19:38
 **/
public interface EmpService {
    /**
     * 登录
     */
    int login(String username,String passwd);

    /**
     * 注册
     */
    int addEmp(Emp emp);

    /**
     * 修改密码
     */
    int updatePasswordByUsername(String username,String passwd);
}
