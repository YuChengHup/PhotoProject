package com.controller;

import com.domain.Emp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-24 11:46
 **/
@RestController
public class TestController {

    @RequestMapping(value = "/mvc/cls1",produces = "text/plain;charset=utf-8")
    public String cls1(){
        return "111你好i";
    }

    @RequestMapping(value = "/mvc/cls2")
    public String cls2(){
        return "222你好";
    }

    @RequestMapping("/json/test1")
    public Emp test1(){
        Emp emp=new Emp();
        emp.setE_name("zhangsan");
        emp.setE_sex("nan");
        emp.setE_tell("10000");
        emp.setUsername("aaaa");
        emp.setPasswd("ssss");
        return emp;
    }
}
