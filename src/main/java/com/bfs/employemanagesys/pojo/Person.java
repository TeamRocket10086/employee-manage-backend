package com.bfs.employemanagesys.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Person", schema = "employee")
public class Person implements Serializable {
    private Integer id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String cellPhone;
    private String alternatePhone;
    private String gender;
    private String ssn;
    private String dob;
    private List<Address> addresses = new ArrayList<>(0);

    /*
    private Employee employee;

    @OneToOne(targetEntity=Employee.class, mappedBy = "person", fetch = FetchType.LAZY)
    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee emp) { this.employee = emp; }*/

    private List<Contact> contacts = new ArrayList<>(0);

    @OneToMany(targetEntity=Contact.class, mappedBy = "person", fetch=FetchType.LAZY
            , cascade={CascadeType.MERGE, CascadeType.REMOVE})
    @JsonIgnore
    public List<Contact> getContacts() {
        return contacts;
    }
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FirstName", nullable = false, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LastName", nullable = false, length = 45)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "MiddleName", nullable = true, length = 45)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "Email", nullable = false, length = 45, unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "CellPhone", nullable = false, length = 20)
    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Basic
    @Column(name = "AlternatePhone", nullable = true, length = 20)
    public String getAlternatePhone() {
        return alternatePhone;
    }

    public void setAlternatePhone(String alternatePhone) {
        this.alternatePhone = alternatePhone;
    }

    @Basic
    @Column(name = "Gender", nullable = true, length = 45)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "SSN", nullable = true, unique = true, length = 20)
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Basic
    @Column(name = "DOB", nullable = true, length = 45)
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @OneToMany(targetEntity=Address.class, mappedBy = "person", fetch=FetchType.LAZY
            , cascade={CascadeType.MERGE, CascadeType.REMOVE})
    @JsonIgnore
    public List<Address> getAddresses() {
        return addresses;
    }
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(middleName, person.middleName) &&
                Objects.equals(email, person.email) &&
                Objects.equals(cellPhone, person.cellPhone) &&
                Objects.equals(alternatePhone, person.alternatePhone) &&
                Objects.equals(gender, person.gender) &&
                Objects.equals(ssn, person.ssn) &&
                Objects.equals(dob, person.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, middleName, email, cellPhone, alternatePhone, gender, ssn, dob);
    }
}
