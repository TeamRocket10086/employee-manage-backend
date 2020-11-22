package com.bfs.employemanagesys.service;

import com.bfs.employemanagesys.dao.AddressDAO;
import com.bfs.employemanagesys.dao.ContactDAO;
import com.bfs.employemanagesys.dao.PersonDAO;
import com.bfs.employemanagesys.domain.PersonalInfoResponse;
import com.bfs.employemanagesys.pojo.Address;
import com.bfs.employemanagesys.pojo.Contact;
import com.bfs.employemanagesys.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonalInfoService {
    public PersonDAO personDAO;
    public AddressDAO addressDAO;
    public ContactDAO contactDAO;
    public PersonalInfoResponse response;

    @Autowired
    public void setNewContactDAO(ContactDAO cDAO) {
        this.contactDAO = cDAO;
    }

    @Autowired
    public void setPersonDAO(PersonDAO pDAO) {
        this.personDAO = pDAO;
    }

    @Autowired
    public void setAddressDAO(AddressDAO aDAO) { this.addressDAO = aDAO; }

    public PersonalInfoResponse getResponse() { return response; }

    @Transactional
    public List<Address> getAddresses(int pid) {
        Person person = personDAO.getPersonById(pid);
        return addressDAO.getAddressesByPerson(person);
    }

    @Transactional
    public Person getPerson(int pid) {
        return personDAO.getPersonById(pid);
    }

    @Transactional
    public List<Contact> getContacts(int pid) {
        Person person = personDAO.getPersonById(pid);
        return contactDAO.getContactsByPerson(person);
    }



    @Transactional
    public void updatePersonByEmailOrPhone(int pid, String email, String phone, String altphone) {
        Person person = personDAO.getPersonById(pid);
        person.setEmail(email);
        person.setCellPhone(phone);
        person.setAlternatePhone(altphone);
        personDAO.addPerson(person);
    }
}
