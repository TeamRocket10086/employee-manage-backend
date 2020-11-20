package com.bfs.employemanagesys.dao.impl;

import com.bfs.employemanagesys.dao.AbstractHibernateDAO;
import com.bfs.employemanagesys.dao.EmployeeDAO;
import com.bfs.employemanagesys.pojo.Employee;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: <br>
 *
 * @author: Billy <br>
 * @createDate: 2020-11-18 <br>
 */
@Repository("EmployeeDAO")
public class EmployeeDAOImpl extends AbstractHibernateDAO implements EmployeeDAO {

    public EmployeeDAOImpl() {setClazz(Employee.class);}

    @Override
    public Employee getEmployeeById(Integer id) {
        return getCurrentSession().get(Employee.class, id);
    }

    @Override
    public List<Employee> getEmployeeByIds(List<Integer> idList) {
        List<Employee> employeeList = new ArrayList<>();
        for (Integer id: idList) {
            employeeList.add(getCurrentSession().get(Employee.class, id));
        }

        return employeeList;
    }

    @Override
    public Integer getEmployeeCount() {
//        String hql = "select count(*) from Employee";
//        Query query = getCurrentSession().createQuery(hql);

//        return ((Integer) query.iterate().next()).intValue();
        return -1;
    }

    @Override
    public int addEmployee(Employee employee) {
        Transaction ts = null;

        try {
            ts = getCurrentSession().beginTransaction();
            getCurrentSession().save(employee);
            ts.commit();
        } catch (Exception e) {
            ts.rollback();
            e.printStackTrace();
            return -1;
        }

        return 1;
    }
}
