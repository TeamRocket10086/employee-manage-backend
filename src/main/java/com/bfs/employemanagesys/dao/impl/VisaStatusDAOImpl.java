package com.bfs.employemanagesys.dao.impl;

import com.bfs.employemanagesys.dao.AbstractHibernateDAO;
import com.bfs.employemanagesys.dao.VisaStatusDAO;
import com.bfs.employemanagesys.pojo.VisaStatus;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("VisaStatusDAO")
public class VisaStatusDAOImpl extends AbstractHibernateDAO implements VisaStatusDAO {

    public VisaStatusDAOImpl() {setClazz(VisaStatus.class);}

    @Override
    public VisaStatus getVisaStatusById(Integer id) {
        return getCurrentSession().get(VisaStatus.class, id);
    }

    @Override
    public int addVisaStatus(VisaStatus v) {
        Transaction ts = null;

        try {
            ts = getCurrentSession().beginTransaction();
            getCurrentSession().save(v);
            ts.commit();
        } catch (Exception e) {
            ts.rollback();
            e.printStackTrace();
            return -1;
        }
        return 1;
    }

    @Override
    public List<VisaStatus> list() {
        return null;
    }
}
