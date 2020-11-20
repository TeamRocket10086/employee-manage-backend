package com.bfs.employemanagesys.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class PersonDTO {
    public String firstName;
    public String lastName;
    public String middleName;
    public String email;
    public String cellPhone;
    public String alternatePhone;
    public String gender;
    public String ssn;
    public String dob;
}
