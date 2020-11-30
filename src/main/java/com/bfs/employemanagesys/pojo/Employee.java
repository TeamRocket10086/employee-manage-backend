package com.bfs.employemanagesys.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Employee", schema = "employee")
public class Employee implements Serializable {
    private Integer id;
    private String title;
    private String startDate;
    private String endDate;
    private String avatar;
    private String car;
    private String visaStartDate;
    private String visaEndDate;
    private String driverLisence;
    private String driverLisenceExpirationDate;

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
    @Column(name = "Title", nullable = false, length = 45)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "StartDate", nullable = false, length = 45)
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "EndDate", nullable = false, length = 45)
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "Avatar", nullable = false, length = 45)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "Car", nullable = false, length = 45)
    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Basic
    @Column(name = "VisaStartDate", nullable = false, length = 45)
    public String getVisaStartDate() {
        return visaStartDate;
    }

    public void setVisaStartDate(String visaStartDate) {
        this.visaStartDate = visaStartDate;
    }

    @Basic
    @Column(name = "VisaEndDate", nullable = false, length = 45)
    public String getVisaEndDate() {
        return visaEndDate;
    }

    public void setVisaEndDate(String visaEndDate) {
        this.visaEndDate = visaEndDate;
    }

    @Basic
    @Column(name = "DriverLisence", nullable = false, length = 45)
    public String getDriverLisence() {
        return driverLisence;
    }

    public void setDriverLisence(String driverLisence) {
        this.driverLisence = driverLisence;
    }

    @Basic
    @Column(name = "DriverLisence_ExpirationDate", nullable = false, length = 45)
    public String getDriverLisenceExpirationDate() {
        return driverLisenceExpirationDate;
    }

    public void setDriverLisenceExpirationDate(String driverLisenceExpirationDate) {
        this.driverLisenceExpirationDate = driverLisenceExpirationDate;
    }

    private Person person;

    @OneToOne(targetEntity=Person.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "PersonID")
    public Person getPerson() {
        return this.person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    private VisaStatus visaStatus;

    @OneToOne(targetEntity=VisaStatus.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "VisaStatusID")
    public VisaStatus getVisaStatus() {
        return this.visaStatus;
    }

    public void setVisaStatus(VisaStatus visaStatus) {
        this.visaStatus = visaStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != null ? !id.equals(employee.id) : employee.id != null) return false;
        if (title != null ? !title.equals(employee.title) : employee.title != null) return false;
        if (startDate != null ? !startDate.equals(employee.startDate) : employee.startDate != null) return false;
        if (endDate != null ? !endDate.equals(employee.endDate) : employee.endDate != null) return false;
        if (avatar != null ? !avatar.equals(employee.avatar) : employee.avatar != null) return false;
        if (car != null ? !car.equals(employee.car) : employee.car != null) return false;
        if (visaStartDate != null ? !visaStartDate.equals(employee.visaStartDate) : employee.visaStartDate != null)
            return false;
        if (visaEndDate != null ? !visaEndDate.equals(employee.visaEndDate) : employee.visaEndDate != null)
            return false;
        if (driverLisence != null ? !driverLisence.equals(employee.driverLisence) : employee.driverLisence != null)
            return false;
        if (driverLisenceExpirationDate != null ? !driverLisenceExpirationDate.equals(employee.driverLisenceExpirationDate) : employee.driverLisenceExpirationDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
        result = 31 * result + (car != null ? car.hashCode() : 0);
        result = 31 * result + (visaStartDate != null ? visaStartDate.hashCode() : 0);
        result = 31 * result + (visaEndDate != null ? visaEndDate.hashCode() : 0);
        result = 31 * result + (driverLisence != null ? driverLisence.hashCode() : 0);
        result = 31 * result + (driverLisenceExpirationDate != null ? driverLisenceExpirationDate.hashCode() : 0);
        return result;
    }
}