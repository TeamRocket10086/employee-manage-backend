package com.bfs.employemanagesys.dao;

import com.bfs.employemanagesys.pojo.Contact;
import com.bfs.employemanagesys.pojo.Person;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactDAO extends AbstractHibernateDAO<Contact> {
    public ContactDAO() {setClazz(Contact.class);}

    public Contact getContactById(Integer id) {
        return findById(id);
    }

    public List<Contact> getContactsByPerson(Person p) {
        String hql = "from Contact where person = ?1";
        Session s = sessionFactory.getCurrentSession();
        Query query = s.createQuery(hql);
        query.setParameter(1, p);
        List<Contact> list = query.list();
        if(list == null || list.size() == 0)
            return null;
        //System.out.println("Size is " + list.size());
        return list;
    }

    public void addContact(Contact contact) {
        Session session = getCurrentSession();
        session.saveOrUpdate(contact);
    }

    public void addContacts(List<Contact> contacts) {
        Session session = getCurrentSession();
        for(Contact contact : contacts){
            session.saveOrUpdate(contact);
        }
    }

}
