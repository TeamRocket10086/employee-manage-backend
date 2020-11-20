package com.bfs.employemanagesys.service;

import com.bfs.employemanagesys.dao.ContactDAO;
import com.bfs.employemanagesys.pojo.Contact;
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
public class ContactService {
    private ContactDAO contactDAO;

    @Autowired
    public void setContactDAO(ContactDAO contactDAO) {
        this.contactDAO = contactDAO;
    }

    @Transactional
    public Integer addContact(Contact contact) {
        return contactDAO.addContact(contact);
    }

    @Transactional
    public Contact getContactById(Integer id) {
        return contactDAO.getContactById(id);
    }
}
