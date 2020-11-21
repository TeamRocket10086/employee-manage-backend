package com.bfs.employemanagesys.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class House implements Serializable {
    private Integer id;
    private String address;
    private Integer numberOfPerson;

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
    @Column(name = "Address", nullable = false, length = 45)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "NumberOfPerson", nullable = false)
    public Integer getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(Integer numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        if (id != null ? !id.equals(house.id) : house.id != null) return false;
        if (address != null ? !address.equals(house.address) : house.address != null) return false;
        if (numberOfPerson != null ? !numberOfPerson.equals(house.numberOfPerson) : house.numberOfPerson != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (numberOfPerson != null ? numberOfPerson.hashCode() : 0);
        return result;
    }
}
