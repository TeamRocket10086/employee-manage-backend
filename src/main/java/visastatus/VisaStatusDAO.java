package visastatus;

import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.*;

public class VisaStatusDAO {
    HibernateTemplate template;
    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
    public void save(VisaStatus v) {
        template.save(v);
    }

    public List<VisaStatus> getVisaStatus(){
        List<VisaStatus> list = new ArrayList<VisaStatus>();
        list = template.loadAll(VisaStatus.class);
        return list;
    }
}
