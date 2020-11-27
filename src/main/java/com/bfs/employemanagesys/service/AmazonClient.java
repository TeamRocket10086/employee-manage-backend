package com.bfs.employemanagesys.service;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 * Description: <br>
 *
 * @author: Billy <br>
 * @createDate: 2020-11-27 <br>
 */

@Service
public class AmazonClient {

    private AmazonS3 s3Client;

    @Value("${amazonProperties.endpointUrl}")
    private String endpointUrl;

    @Value("${amazonProperties.bucketName}")
    private String bucketName;

    @Value("${amazonProperties.accessKey}")
    private String accessKey;

    @Value("${amazonProperties.sercetKey}")
    private String sercetKey;

    private Logger logger = LoggerFactory.getLogger(AmazonClient.class);

    @PostConstruct
    private void initializeAmazon() {
        AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.sercetKey);
        this.s3Client = new AmazonS3Client(credentials);
    }

//    public String uploadFile(MultipartFile multipartFile) throws IOException {
//        String fileUrl = "";
//        try {
//            File file  = convertMultiPartToFile(multipartFile);
//            String fileName = generateFileName(multipartFile);
//            fileUrl = endpointUrl + "/" + bucketName + "/" + fileName;
//            uploadFileTos3bucket(fileName, file);
//        } catch (AmazonServiceException ase) {
//            logger.info("Caught an AmazonServiceException from GET requests");
//            logger.info("Error Message:        " + ase.getMessage());
//        }
//
//        return fileUrl;
//    }

    public String deleteFileFromS3Bucket(String fileUrl) {
        String fileName = fileUrl.substring(fileUrl.lastIndexOf("/") + 1);
        s3Client.deleteObject(
            new DeleteObjectRequest(bucketName + "/", fileName)
        );
        return "Successfully deleted.";
    }

    private void uploadFileTos3bucket(String fileName, File file) {
        s3Client.putObject(
            new PutObjectRequest(bucketName, fileName, file)
        );
    }

//    private String generateFileName(MultipartFile multipartFile) {
//        return new Date().getTime() + "-" + multipartFile.getOriginalFilename().replace(" ","_");
//    }
//
//    private File convertMultiPartToFile(MultipartFile file) throws IOException {
//        File convFile = new File(file.getOriginalFilename());
//        FileOutputStream fos = new FileOutputStream(convFile);
//        fos.write(file.getBytes());
//        fos.close();
//
//        return convFile;
//    }
}
