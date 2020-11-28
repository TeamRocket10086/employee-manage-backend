package com.bfs.employemanagesys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication (exclude = HibernateJpaAutoConfiguration.class)
public class EmployemanagesysApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployemanagesysApplication.class, args);
    }

}
