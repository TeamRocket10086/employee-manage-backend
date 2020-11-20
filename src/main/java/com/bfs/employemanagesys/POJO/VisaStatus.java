package com.bfs.employemanagesys.POJO;

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
@Table(name = "VisaStatus")
public class VisaStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    private String VisaType;
    private boolean Active;
    private String ModificationDate;
    private String CreateUser;
}
