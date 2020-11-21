package com.bfs.employemanagesys.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "VisaStatus", schema = "employee")
public class VisaStatus implements Serializable {

    private Integer id;
    private Integer active;
    private String visaType;
    private String modificationDate;
    private String createUser;

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
    @Column(name = "Active", nullable = false)
    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Basic
    @Column(name = "VisaType", nullable = false, length = 45)
    public String getVisaType() {
        return visaType;
    }

    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }

    @Basic
    @Column(name = "ModificationDate", nullable = false, length = 45)
    public String getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

    @Basic
    @Column(name = "CreateUser", nullable = false, length = 45)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VisaStatus that = (VisaStatus) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (active != null ? !active.equals(that.active) : that.active != null) return false;
        if (visaType != null ? !visaType.equals(that.visaType) : that.visaType != null) return false;
        if (modificationDate != null ? !modificationDate.equals(that.modificationDate) : that.modificationDate != null)
            return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (visaType != null ? visaType.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (modificationDate != null ? modificationDate.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        return result;
    }
}
