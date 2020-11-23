package com.bfs.employemanagesys.domain;

import com.bfs.employemanagesys.pojo.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO implements DTO<Person> {
    public String firstName;
    public String lastName;
    public String middleName;
    public String email;
    public String cellPhone;
    public String alternatePhone;
    public String gender;
    public String ssn;
    public String dob;
    int age;
    //public String passwordToSend;
    //public String passwordToSet;

    @Override
    public void convertToDTO (Person p) {
        firstName = p.getFirstName();
        lastName = p.getLastName();
        middleName = p.getMiddleName();
        email = p.getEmail();
        cellPhone = p.getCellPhone();
        alternatePhone = p.getAlternatePhone();
        gender = p.getGender();
        dob = p.getDob();
        LocalDate birthDate = LocalDate.parse(dob);
        LocalDate currentDate = LocalDate.now();
        age = Period.between(birthDate, currentDate).getYears();
        // Hide info in ssn
        ssn = "xxxxx" + p.getSsn().substring(5);
        //passwordToSet = null;
    }

    @Override
    public void convertToEntity (Person p) {
        p.setAlternatePhone(this.alternatePhone);
        if(this.cellPhone != null && this.cellPhone.length() > 0)
            p.setCellPhone(this.cellPhone);
        if(this.dob != null && this.dob.length() > 0)
            p.setDob(this.dob);
        if(this.email != null && this.email.length() > 0)
            p.setEmail(this.email);
        if(this.firstName != null && this.firstName.length() > 0)
            p.setFirstName(this.firstName);
        if(this.gender != null && this.gender.length() > 0)
            p.setGender(this.gender);
        if(this.lastName != null && this.lastName.length() > 0)
            p.setLastName(this.lastName);
        p.setMiddleName(this.middleName);
        if(this.ssn != null && this.ssn.length() > 0)
            p.setSsn(this.ssn);
    }
}
