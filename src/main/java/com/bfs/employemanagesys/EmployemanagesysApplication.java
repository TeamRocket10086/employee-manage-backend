package com.bfs.employemanagesys;

import com.bfs.employemanagesys.dao.VisaStatusDAO;
import com.bfs.employemanagesys.pojo.VisaStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication (exclude = HibernateJpaAutoConfiguration.class)
public class EmployemanagesysApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployemanagesysApplication.class, args);
    }

}
