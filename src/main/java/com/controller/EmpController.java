package com.controller;

import com.domain.Emp;
import com.service.EmpService;
import com.util.MD5util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-23 19:48
 **/
@Controller
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping("/mvc/login")
    public void login(String username, String passwd, HttpServletRequest req, HttpServletResponse resp, HttpSession session) throws ServletException, IOException {
        int i = empService.login(username, MD5util.toMd5(passwd));
        if (i==3){
            req.setAttribute("error1","用户名不存在");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }else if (i==1){
            req.setAttribute("error2","密码错误");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }else {
            session.setAttribute("username",username);
            req.getRequestDispatcher("/mvc/findAllCustomer").forward(req,resp);
        }
    }

    @RequestMapping("/mvc/reg")
    public ModelAndView reg(Emp emp){
        String passwd = emp.getPasswd();
        emp.setPasswd(MD5util.toMd5(passwd));
        ModelAndView mv=new ModelAndView();
        int i1 = empService.login(emp.getUsername(), emp.getPasswd());
        System.out.println(i1);
        System.out.println(emp.getUsername());

        if (i1!=3){
            mv.addObject("error1","用户名已存在");
            mv.setViewName("/reg.jsp");
            System.out.println(i1);
            return mv;
        }else {
            int i = empService.addEmp(emp);
            if (i>0){
                mv.setViewName("/login.jsp");
            }else {
                mv.addObject("error","注册失败");
                mv.setViewName("/reg.jsp");
            }
            return mv;
        }
    }

    @RequestMapping("/mvc/updatePasswordByUsername")
    public ModelAndView updatePasswordByUsername(String username,String passwd,String passwd1){
        ModelAndView mv=new ModelAndView();
        if (passwd!=passwd1){
            mv.addObject("error","两次密码不相同");
            mv.setViewName("/updatepasswd.jsp");
            return mv;
        }

        int i = empService.updatePasswordByUsername(username, passwd);
        if (i>0){
            mv.setViewName("/login.jsp");
            return mv;
        }else{
            mv.addObject("error","修改失败");
            mv.setViewName("/updatepasswd.jsp");
            return mv;
        }
    }
}
