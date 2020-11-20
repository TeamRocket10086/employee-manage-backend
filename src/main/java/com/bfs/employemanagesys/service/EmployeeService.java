package com.bfs.employemanagesys.service;

import com.bfs.employemanagesys.DAO.EmployeeDAO;
import com.bfs.employemanagesys.POJO.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description: <br>
 *
 * @author: Billy <br>
 * @createDate: 2020-11-18 <br>
 */
@Component
public class EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Transactional
    public Integer addEmployee(Employee employee) {
        return employeeDAO.addEmployee(employee);
    }

    @Transactional
    public Employee getEmployeeById(Integer id) {
        return employeeDAO.getEmployeeById(id);
    }
}
