package com.bfs.employemanagesys.dao;

import com.bfs.employemanagesys.pojo.VisaStatus;

import java.util.List;

public interface VisaStatusDAO {
    VisaStatus getVisaStatusById (Integer id);

    public int addVisaStatus(VisaStatus v);

    public List<VisaStatus> list();
}
