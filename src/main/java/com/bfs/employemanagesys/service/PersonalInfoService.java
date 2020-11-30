package com.bfs.employemanagesys.service;

import com.bfs.employemanagesys.dao.AddressDAO;
import com.bfs.employemanagesys.dao.ContactDAO;
import com.bfs.employemanagesys.dao.EmployeeDAO;
import com.bfs.employemanagesys.dao.PersonDAO;
import com.bfs.employemanagesys.domain.*;
import com.bfs.employemanagesys.pojo.Address;
import com.bfs.employemanagesys.pojo.Contact;
import com.bfs.employemanagesys.pojo.Employee;
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
    public EmployeeDAO employeeDAO;
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

    @Autowired
    public void setEmployeeDAO(EmployeeDAO eDAO) { this.employeeDAO = eDAO; }

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
    public void updatePerson(PersonDTO personDTO, int pid) {
        Person p = personDAO.getPersonById(pid);
        if(p != null) {
            personDTO.convertToEntity(p);
            personDAO.addPerson(p);
        }
    }

    @Transactional
    public List<Contact> getContacts(int pid) {
        Person person = personDAO.getPersonById(pid);
        return contactDAO.getContactsByPerson(person);
    }

    @Transactional
    public void addOrUpdateContact(ContactDTO contactDTO) {
        Contact contact = contactDAO.getContactById(contactDTO.getId());
        if(contact == null)
            contact = new Contact();
        contactDTO.convertToEntity(contact);
        contactDAO.addContact(contact);
    }

    @Transactional
    public void addOrUpdateAddress(AddressDTO addressDTO) {
        Address addr = addressDAO.getAddressById(addressDTO.getId());
        if(addr == null)
            addr = new Address();
        addressDTO.convertToEntity(addr);
        addressDAO.addAddress(addr);
    }

    @Transactional
    public Employee getEmployee(int id) {
        Person p = personDAO.getPersonById(id);
        //System.out.println(p.getFirstName());
        //return employeeDAO.getEmployeeByPerson(p);
        return employeeDAO.getEmployeeById(id);
    }

    @Transactional
    public void updateEmployee(EmployeeDTO emp, int pid) {
        Employee employee = employeeDAO.getEmployeeById(emp.getEid());
        if(employee == null)
            employee = new Employee();
        emp.convertToEntity(employee);
        employeeDAO.addEmployee(employee);
    }

    /*
    @Transactional
    public void updatePersonByEmailOrPhone(int pid, String email, String phone, String altphone) {
        Person person = personDAO.getPersonById(pid);
        person.setEmail(email);
        person.setCellPhone(phone);
        person.setAlternatePhone(altphone);
        personDAO.addPerson(person);
    }
     */
}
