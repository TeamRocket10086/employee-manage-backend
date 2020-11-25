package com.bfs.employemanagesys.dao;

import com.bfs.employemanagesys.pojo.House;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class HouseDAO extends AbstractHibernateDAO<House> {
    public HouseDAO() {
        setClazz(House.class);
    }

    public House getHouseById(Integer id) {
        return findById(id);
    }

    public void addHouse(House h) {
        Session session = getCurrentSession();
        session.saveOrUpdate(h);
    }

}