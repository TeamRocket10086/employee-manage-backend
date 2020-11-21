package com.bfs.employemanagesys.dao;


import com.bfs.employemanagesys.pojo.Person;
import com.bfs.employemanagesys.pojo.VisaStatus;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

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
