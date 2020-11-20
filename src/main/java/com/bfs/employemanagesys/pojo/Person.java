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
import java.io.Serializable;

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
@Table(name = "Person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    private String FirstName;
    private String LastName;
    private String MiddleName;
    private String Email;
    private String CellPhone;
    private String AlternatePhone;
    private String Gender;
    private String SSN;
    private String DOB;

}
