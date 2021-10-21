package com.dao;

import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-24 22:38
 **/
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jd;
    /**
     * 注册
     */
    public int addUser(User user){
        Object[] objs={user.getUname(),user.getTell(),user.getTx(),user.getUsername(),user.getPasswd()};
        int i = jd.update("insert into user values(null,?,?,?,?,?)", objs);
        return i;
    }
}
