package com.bfs.employemanagesys.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Contact")
/**
 * George: No address for Contact supported by current DB design
 */
public class Contact implements Serializable {
    private boolean isReferrence;
    private boolean isEmergency;
    private boolean isLandlord;
    private Integer id;
    private String relationship;
    private String name;
    private String email;
    private String phone;

    private Person person;
    @ManyToOne(targetEntity=Person.class)
    @JoinColumn(name = "PersonID")
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person p) {
        this.person = p;
    }

    @Basic
    @Column(name = "isReferrence", nullable = false)
    public boolean getIsReferrence() {
        return isReferrence;
    }

    public void setIsReferrence(boolean isReferrence) {
        this.isReferrence = isReferrence;
    }

    @Basic
    @Column(name = "isEmergency", nullable = false)
    public boolean getIsEmergency() {
        return isEmergency;
    }

    public void setIsEmergency(boolean isEmergency) {
        this.isEmergency = isEmergency;
    }

    @Basic
    @Column(name = "isLandlord", nullable = false)
    public boolean getIsLandlord() {
        return isLandlord;
    }

    public void setIsLandlord(boolean isLandlord) {
        this.isLandlord = isLandlord;
    }

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Relationship", nullable = false, length = 45)
    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Email", nullable = false, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Phone", nullable = false, length = 20)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return isReferrence == contact.isReferrence &&
                isEmergency == contact.isEmergency &&
                isLandlord == contact.isLandlord &&
                Objects.equals(id, contact.id) &&
                Objects.equals(relationship, contact.relationship) &&
                Objects.equals(name, contact.name) &&
                Objects.equals(email, contact.email) &&
                Objects.equals(phone, contact.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, relationship, isReferrence, isEmergency, isLandlord, name, email, phone);
    }
}