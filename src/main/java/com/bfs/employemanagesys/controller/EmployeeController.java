package com.bfs.employemanagesys.controller;

import com.bfs.employemanagesys.POJO.Employee;
import com.bfs.employemanagesys.service.EmployeeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: <br>
 *
 * @author: Billy <br>
 * @createDate: 2020-11-18 <br>
 */
@RestController
@RequestMapping("/Employee")
@CrossOrigin
public class EmployeeController {

    EmployeeService employeeService;



}
