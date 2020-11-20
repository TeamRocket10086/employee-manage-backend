package com.bfs.employemanagesys.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Description: <br>
 *
 * @author: Billy <br>
 * @createDate: 2020-11-19 <br>
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@Table(name = "House")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ContactID", referencedColumnName = "ID")
    private Contact contact;

    private String Address;
    private int NumberOfPerson;
}
