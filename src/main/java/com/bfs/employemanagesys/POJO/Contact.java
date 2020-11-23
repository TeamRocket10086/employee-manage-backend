package com.bfs.employemanagesys.POJO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
@Table(name = "Contact")
public class Contact {
    private int ID;
    private int PersonID;
    private String Relationship;
    private String Title;
    private boolean isReferrence;
    private boolean isEmergency;
    private boolean isLandlord;
}
