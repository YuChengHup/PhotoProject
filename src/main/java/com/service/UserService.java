package com.service;

import com.dao.UserDao;
import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-24 22:42
 **/
@Service
public class UserService {
    @Autowired private UserDao userDao;
    public int addUser(User user){
        int i = userDao.addUser(user);
        return i;
    }
}
