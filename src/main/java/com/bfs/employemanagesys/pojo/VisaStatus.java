package com.bfs.employemanagesys.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "VisaStatus", schema = "employee")
public class VisaStatus implements Serializable {

    private Integer id;
    private String visatype;
    private Integer active;
    private String modificationdate;
    private String createuser;

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
    @Column(name = "VisaType", nullable = false, length = 45)
    public String getVisaType() {
        return visatype;
    }
    public void setVisaType(String visatype) {
        this.visatype = visatype;
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
    @Column(name = "ModificationDate", nullable = false, length = 45)
    public String getModificationdate() {
        return modificationdate;
    }
    public void setModificationdate(String modificationdate) {
        this.modificationdate = modificationdate;
    }

    @Basic
    @Column(name = "CreateUser", nullable = false, length = 45)
    public String getCreateuser() {
        return createuser;
    }
    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    @Override
    public String toString() {
        return  "id = " + id +
                " visatype = " + visatype +
                " active = " + active +
                " modifcationdate = " + modificationdate +
                " createuser = " + createuser;

    }
}
