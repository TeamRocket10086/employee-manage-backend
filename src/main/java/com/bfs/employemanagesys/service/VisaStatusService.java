package com.bfs.employemanagesys.service;

import com.bfs.employemanagesys.dao.VisaStatusDAO;
import com.bfs.employemanagesys.pojo.VisaStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class VisaStatusService {
    private VisaStatusDAO visaStatusDAO;

    @Autowired
    public void setVisaStatusDAO(VisaStatusDAO visaStatusDAO) {
        this.visaStatusDAO = visaStatusDAO;
    }

    @Transactional
    public int addVisaStatus(VisaStatus v) {
        return visaStatusDAO.addVisaStatus(v);
    }

    @Transactional
    public VisaStatus getVisaStatusById(Integer id) {
        return visaStatusDAO.getVisaStatusById(id);
    }
}
