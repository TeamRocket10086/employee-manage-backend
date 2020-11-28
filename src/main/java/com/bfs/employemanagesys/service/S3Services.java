package com.bfs.employemanagesys.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Description: <br>
 *
 * @author: Billy <br>
 * @createDate: 2020-11-27 <br>
 */
public interface S3Services {
    public void downloadFile(String keyName);
    public void uploadFile(MultipartFile file) throws IOException;
}
