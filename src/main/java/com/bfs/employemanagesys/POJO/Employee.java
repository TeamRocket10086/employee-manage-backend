package com.bfs.employemanagesys.POJO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Description: <br>
 *
 * @author: Billy <br>
 * @createDate: 2020-11-18 <br>
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PersonID", referencedColumnName = "ID")
    private Person person;

    private String Title;
    private String StartDate;
    private String EndDate;
    private String Avatar;
    private String Car;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "VisaStatusID", referencedColumnName = "ID")
    private VisaStatus visaStatus;
    private String VisaStartDate;
    private String VisaEndDate;
    private String DriverLisence;
    private String DriverLisence_ExpirationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HouseID")
    @JsonIgnore
    private House house;
}
