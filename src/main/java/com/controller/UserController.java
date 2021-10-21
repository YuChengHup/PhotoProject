package com.controller;

import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.service.UserService;

import java.io.File;
import java.io.IOException;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-24 22:24
 **/
@Controller
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/mvc/upload1")
    public ModelAndView upload(User user, MultipartFile tx1) throws IOException {
        ModelAndView mv=new ModelAndView();

        //获取原文件名
        String originalFilename = tx1.getOriginalFilename();
        user.setTx(originalFilename);

        //写入文件
        File file=new File("e:\\"+originalFilename);
        tx1.transferTo(file);

        //注册
        int i = service.addUser(user);
        if (i>0){
            mv.addObject("tx",originalFilename);
            mv.setViewName("/Hello.jsp");
            return mv;
        }else {
            mv.addObject("error","注册失败");
            mv.setViewName("/Reg1.jsp");
            return mv;
        }
    }
}
