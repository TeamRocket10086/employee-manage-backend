package visastatus;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test {
    public static void main(String[] args) {
        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory f = new XmlBeanFactory(r);

        VisaStatusDAO dao = (VisaStatusDAO)f.getBean("d");

        VisaStatus v = new VisaStatus();
        v.setVisaType("F1");
        v.setActive(0);
        v.setModificationdate("11-18-2020");
        v.setCreateuser("allan");

        dao.save(v);
    }
}
