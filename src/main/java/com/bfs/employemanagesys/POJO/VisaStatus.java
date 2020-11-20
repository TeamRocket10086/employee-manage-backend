package com.bfs.employemanagesys.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Getter @Setter @AllArgsConstructor
@Table(name = "VisaStatus", schema = "employee")
public class VisaStatus implements Serializable {

    private @Id Integer id;
    private String visatype;
    private Integer active;
    private String modificationdate;
    private String createuser;

    public VisaStatus() {

    }

    public VisaStatus(String visatype, Integer active, String modificationdate, String createuser) {
        this.visatype = visatype;
        this.active = active;
        this.modificationdate = modificationdate;
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
