package com.bfs.employemanagesys.domain;

import com.bfs.employemanagesys.pojo.Address;
import com.bfs.employemanagesys.pojo.Contact;
import com.bfs.employemanagesys.pojo.Person;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonalInfoResponse {
    private ServiceStatus serviceStatus;
    private Person person;
    private Address primary;
    private Address secondary;
    private Contact referee;
    private List<Contact> emergencies;
}
