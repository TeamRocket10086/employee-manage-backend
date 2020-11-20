package com.bfs.employemanagesys.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Table;
import java.io.Serializable;

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
public class Contact implements Serializable {
    private int ID;
    private int PersonID;
    private String Relationship;
    private String Title;
    private boolean isReferrence;
    private boolean isEmergency;
    private boolean isLandlord;;
}
