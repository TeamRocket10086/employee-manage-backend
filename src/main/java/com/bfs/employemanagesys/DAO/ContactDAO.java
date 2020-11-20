package com.bfs.employemanagesys.dao;

import com.bfs.employemanagesys.pojo.Contact;

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
