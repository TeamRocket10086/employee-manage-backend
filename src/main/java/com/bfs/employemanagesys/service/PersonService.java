package com.bfs.employemanagesys.service;

import com.bfs.employemanagesys.dao.AddressDAO;
import com.bfs.employemanagesys.dao.PersonDAO;
import com.bfs.employemanagesys.domain.PersonDTO;
import com.bfs.employemanagesys.pojo.Address;
import com.bfs.employemanagesys.pojo.Person;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {

    public PersonDAO personDAO;
    public AddressDAO addressDAO;

    @Autowired
    public void setPersonDAO(PersonDAO pDAO) {
        this.personDAO = pDAO;
    }

    @Autowired
    public void setAddressDAO(AddressDAO aDAO) { this.addressDAO = aDAO; }

    @Transactional
    /**
     * First name, Last name, Middle name, Phone, Address, Email, Relationship
     */
    public void addReferee(){
        //personDAO.addPerson();
    }

    @Transactional
    public void addPerson(PersonDTO personDTO, List<Address> addresses){
        Person p = new Person();
        p.setAlternatePhone(personDTO.alternatePhone);
        p.setCellPhone(personDTO.cellPhone);
        p.setDob(personDTO.dob);
        p.setEmail(personDTO.email);
        p.setFirstName(personDTO.firstName);
        p.setGender(personDTO.gender);
        p.setLastName(personDTO.lastName);
        p.setMiddleName(personDTO.middleName);
        p.setSsn(personDTO.ssn);
        for(Address addr : addresses){
            addr.setPerson(p);
            addressDAO.addAddress(addr);
        }
        p.setAddresses(addresses);
        personDAO.addPerson(p);
    }

    @Transactional
    public void addPerson(String firstName, String lastName,
                          String middleName, String email, String cellPhone, String alternatePhone
            , String gender, String ssn, String dob, List<Address> addresses) {
        Person p = new Person();
        p.setAlternatePhone(alternatePhone);
        p.setCellPhone(cellPhone);
        p.setDob(dob);
        p.setEmail(email);
        p.setFirstName(firstName);
        p.setGender(gender);
        p.setLastName(lastName);
        p.setMiddleName(middleName);
        p.setSsn(ssn);
        for(Address addr : addresses){
            addr.setPerson(p);
            addressDAO.addAddress(addr);
        }
        p.setAddresses(addresses);
        personDAO.addPerson(p);
    }
}
