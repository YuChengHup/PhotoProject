package com.controller;

import com.domain.Student;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-24 15:22
 **/
@RestController
public class TestDateController {

    @RequestMapping("/date/stu")
    public Student cls1(Student student){
        System.out.println(student.getBirth());
        return student;
    }
}
