package com.bfs.employemanagesys.service;

import com.bfs.employemanagesys.dao.HouseDAO;
import com.bfs.employemanagesys.pojo.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class HouseService {
    private HouseDAO HouseDAO;

    @Autowired
    public void setHouseDAO(HouseDAO HouseDAO) {
        this.HouseDAO = HouseDAO;
    }

    @Transactional
    public void addHouse(String address, Integer numberOfPerson) {
        House h = new House();
        h.setAddress(address);
        h.setNumberOfPerson(numberOfPerson);
        HouseDAO.addHouse(h);
    }

    @Transactional
    public House getHouseById(Integer id) {
        return HouseDAO.getHouseById(id);
    }
}
