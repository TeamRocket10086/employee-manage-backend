package com.bfs.employemanagesys.dao;


import com.bfs.employemanagesys.pojo.VisaStatus;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class VisaStatusDAO extends AbstractHibernateDAO<VisaStatus> {
    public VisaStatusDAO() {
        setClazz(VisaStatus.class);
    }

    public VisaStatus getVisaStatusById(Integer id) {
        return findById(id);
    }

    public void addVisaStatus(VisaStatus v) {
        Session session = getCurrentSession();
        session.saveOrUpdate(v);
    }

}
