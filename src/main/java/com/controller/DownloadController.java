package com.controller;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-24 17:33
 **/
@RestController
public class DownloadController {
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(String fileName) throws IOException {
        File file = new File("d:\\"+fileName);

        if (!file.exists()){
            return null;
        }

        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attchment",fileName);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
    }
}
