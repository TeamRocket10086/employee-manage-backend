package com.bfs.employemanagesys.dao;

import com.bfs.employemanagesys.pojo.Employee;

import java.util.List;

/**
 * Description: <br>
 *
 * @author: Billy <br>
 * @createDate: 2020-11-18 <br>
 */
public interface EmployeeDAO {

    Employee getEmployeeById(Integer id);

    List<Employee> getEmployeeByIds(List<Integer> idList);

    Integer getEmployeeCount();

    int addEmployee(Employee employee);
}
