package com.bfs.employemanagesys.DAO.impl;

import com.bfs.employemanagesys.DAO.AbstractHibernateDAO;
import com.bfs.employemanagesys.DAO.ContactDAO;
import com.bfs.employemanagesys.POJO.Contact;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 * Description: <br>
 *
 * @author: Billy <br>
 * @createDate: 2020-11-18 <br>
 */
@Repository("ContactDAO")
public class ContactDAOImpl extends AbstractHibernateDAO implements ContactDAO {

    public ContactDAOImpl() {setClazz(Contact.class);}

    @Override
    public Contact getContactById(Integer id) {
        return getCurrentSession().get(Contact.class, id);
    }

    @Override
    public int addContact(Contact contact) {
        Transaction ts = null;

        try {
            ts = getCurrentSession().beginTransaction();
            getCurrentSession().save(contact);
            ts.commit();
        } catch (Exception e) {
            ts.rollback();
            e.printStackTrace();
            return -1;
        }

        return 1;
    }

}
