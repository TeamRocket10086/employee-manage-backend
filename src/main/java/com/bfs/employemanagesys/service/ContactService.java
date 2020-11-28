package com.bfs.employemanagesys.service;

import com.bfs.employemanagesys.dao.ContactDAO;
import com.bfs.employemanagesys.pojo.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public void addContact(Integer personID, String relationship, boolean isReferrence, boolean isEmergency, boolean isLandlord, String name, String email, String phone, List<Contact> contacts) {
        Contact c = new Contact();

        c.setRelationship(relationship);
        c.setIsReferrence(isReferrence);
        c.setIsEmergency(isEmergency);
        c.setIsLandlord(isLandlord);
        c.setName(name);
        c.setEmail(email);
        c.setPhone(phone);
        contactDAO.addContact(c);
    }

    @Transactional
    public Contact getContactById(Integer id) {
        return contactDAO.getContactById(id);
    }
}
