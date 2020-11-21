package com.bfs.employemanagesys;

import com.bfs.employemanagesys.dao.VisaStatusDAO;
import com.bfs.employemanagesys.pojo.VisaStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployemanagesysApplication {

    public static void main(String[] args) {
        VisaStatus v = new VisaStatus("F1", 0, "11-18-2020", "allan");
        SpringApplication.run(EmployemanagesysApplication.class, args);
    }

}
