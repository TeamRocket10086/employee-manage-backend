package com.bfs.employemanagesys.DAO;

import com.bfs.employemanagesys.POJO.Contact;

import java.util.List;

/**
 * Description: <br>
 *
 * @author: Billy <br>
 * @createDate: 2020-11-18 <br>
 */
public interface ContactDAO {

    Contact getContactById(Integer id);

    int addContact(Contact contact);
}
