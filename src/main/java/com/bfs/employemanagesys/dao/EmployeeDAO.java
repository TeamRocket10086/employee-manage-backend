package com.bfs.employemanagesys.dao;

import com.bfs.employemanagesys.pojo.Employee;
import com.bfs.employemanagesys.pojo.Person;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAO extends AbstractHibernateDAO<Employee> {
    public EmployeeDAO() {
        setClazz(Employee.class);
    }

    public Employee getEmployeeById(Integer id) {
        return findById(id);
    }

    public Employee getEmployeeByPerson(Person person) {
        String hql = "from Employee where Person = ?1";
        Session s = sessionFactory.getCurrentSession();
        Query query = s.createQuery(hql);
        query.setParameter(1, person);
        List<Employee> list = query.list();
        if(list == null || list.size() == 0)
            return null;
        //System.out.println("Size is " + list.size());
        return list.get(0);
    }


    public void addEmployee(Employee employee) {
        Session session = getCurrentSession();
        session.saveOrUpdate(employee);
    }
}