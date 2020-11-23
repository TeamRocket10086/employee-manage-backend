package com.bfs.employemanagesys.controller;

import com.bfs.employemanagesys.POJO.Contact;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: <br>
 *
 * @author: Billy <br>
 * @createDate: 2020-11-18 <br>
 */
@RestController
@RequestMapping("/Contact")
@CrossOrigin
public class ContactController {

    @GetMapping("/show")
    public Contact personal() {

        Contact contact = new Contact(1, 1, "FatherAndSon", "Developer", false, false, false);
        return contact;
    }
}
