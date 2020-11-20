package com.bfs.employemanagesys.dao;

import com.bfs.employemanagesys.pojo.Address;
import com.bfs.employemanagesys.pojo.Person;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("addressDao")
public class AddressDAO extends AbstractHibernateDAO<Address>  {
    public AddressDAO() {
        setClazz(Address.class);
    }

    public Address getAddressById(Integer id) {
        return findById(id);
    }

    public List<Address> getAddressesByPerson(Person p) {
        String hql = "from Address where person = ?1";
        Session s = sessionFactory.getCurrentSession();
        Query query = s.createQuery(hql);
        query.setParameter(1, p);
        List<Address> list = query.list();
        if(list == null || list.size() == 0)
            return null;
        //System.out.println("Size is " + list.size());
        return list;
    }

    public void addAddress(Address addr) {
        Session session = getCurrentSession();
            session.saveOrUpdate(addr);
    }

    public void addAddresses(List<Address> addresses) {
        Session session = getCurrentSession();
        for(Address addr : addresses){
            session.saveOrUpdate(addr);
        }
    }
}
