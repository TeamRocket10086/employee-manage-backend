package visastatus;

import javax.persistence.*;

@Entity
@Table(name = "VisaStatus")
public class VisaStatus {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String visatype;
    private int active;
    private String modificationdate;
    private String createuser;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getVisaType() {
        return visatype;
    }
    public void setVisaType(String visatype) {
        this.visatype = visatype;
    }
    public int getActive() {
        return active;
    }
    public void setActive(int active) {
        this.active = active;
    }
    public String getModificationdate() {
        return modificationdate;
    }
    public void setModificationdate(String modificationdate) {
        this.modificationdate = modificationdate;
    }
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
