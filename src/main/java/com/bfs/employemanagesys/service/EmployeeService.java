package com.bfs.employemanagesys.service;

import com.bfs.employemanagesys.dao.EmployeeDAO;
import com.bfs.employemanagesys.domain.EmployeeDTO;
import com.bfs.employemanagesys.pojo.Employee;
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
    public void addEmployee(EmployeeDTO employeeDTO) {
        Employee e = new Employee();
        e.setAvatar(employeeDTO.avatar);
        e.setCar(employeeDTO.car);
        e.setDriverLisence(employeeDTO.driverLicense);
        e.setDriverLisenceExpirationDate(employeeDTO.driverLicenseExpirationDate);
        e.setEndDate(employeeDTO.endDate);
        e.setStartDate(employeeDTO.startDate);
        e.setTitle(employeeDTO.title);
        e.setVisaStartDate(employeeDTO.visaStartDate);
        e.setVisaEndDate(employeeDTO.visaEndDate);
        employeeDAO.addEmployee(e);
    }

    @Transactional
    public Employee getEmployeeById(Integer id) {
        return employeeDAO.getEmployeeById(id);
    }
}
