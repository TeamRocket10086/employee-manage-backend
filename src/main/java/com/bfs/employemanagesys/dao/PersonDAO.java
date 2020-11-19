package com.bfs.employemanagesys.dao;

import com.bfs.employemanagesys.pojo.Person;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("personDao")
public class PersonDAO extends AbstractHibernateDAO<Person> {
    public PersonDAO() {
        setClazz(Person.class);
    }

    public Person getPersonById(Integer id) {
        return findById(id);
    }

    public Person getPersonByEmail(String email) {
        String hql = "from Person where email = ?1";
        Session s = sessionFactory.getCurrentSession();
        Query query = s.createQuery(hql);
        query.setParameter(1, email);
        List<Person> list = query.list();
        if(list == null || list.size() == 0)
            return null;
        //System.out.println("Size is " + list.size());
        return list.get(0);
    }

    public Person getPersonBySSN(String ssn) {
        String hql = "from Person where ssn = ?1";
        Session s = sessionFactory.getCurrentSession();
        Query query = s.createQuery(hql);
        query.setParameter(1, ssn);
        List<Person> list = query.list();
        if(list == null || list.size() == 0)
            return null;
        //System.out.println("Size is " + list.size());
        return list.get(0);
    }

    public void addPerson(Person person) {
        Session session = getCurrentSession();
        session.saveOrUpdate(person);
    }
}
