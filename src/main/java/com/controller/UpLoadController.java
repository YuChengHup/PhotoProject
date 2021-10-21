package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-24 17:15
 **/
@RestController
public class UpLoadController {
    @RequestMapping("/upload")
    public String upload(String username, MultipartFile multipartFile) throws IOException {
//        获取源文件
        String filename = multipartFile.getOriginalFilename();

//        写入文件
        File file=new File("e://"+filename);
        multipartFile.transferTo(file);
        return "filed success";
    }
}
