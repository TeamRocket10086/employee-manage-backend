package com.bfs.employemanagesys.domain;

import com.bfs.employemanagesys.pojo.Address;
import com.bfs.employemanagesys.pojo.Contact;
import com.bfs.employemanagesys.pojo.Person;
import com.bfs.employemanagesys.pojo.VisaStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonalInfoResponse {
    private ServiceStatus serviceStatus;
    private PersonDTO person;
    private AddressDTO primary;
    private AddressDTO secondary;
    private ContactDTO referee;
    private List<ContactDTO> emergencies;
    private EmployeeDTO employee;
    private VisaStatus visa;

    public void setPerson(Person p){
        person = new PersonDTO();
        person.convertToDTO(p);
    }

    public void setResponseContacts(List<Contact> contacts) {
        emergencies = new ArrayList<>();
        if(contacts != null) {
            for(Contact contact : contacts){
                if(contact.getIsReferrence()) {
                    referee = new ContactDTO();
                    referee.convertToDTO(contact);
                    //System.out.println(contact.getPerson().getFirstName());
                }
                else {
                    ContactDTO dto = new ContactDTO();
                    dto.convertToDTO(contact);
                    emergencies.add(dto);
                }
            }
        }
        else {
            serviceStatus.setSuccess(false);
            serviceStatus.setErrorMessage("No contact info in DB!");
        }
    }

    public void setResponseAddresses(List<Address> addresses) {
        if(addresses != null) {
            for(Address addr : addresses){
                if(addr.getIsPrimary()) {
                    primary = new AddressDTO();
                    primary.convertToDTO(addr);
                    //primary.setPerson(null);
                }
                else {
                    secondary = new AddressDTO();
                    secondary.convertToDTO(addr);
                    //secondary.setPerson(null);
                }
            }
        }
        else {
            serviceStatus.setSuccess(false);
            serviceStatus.setErrorMessage("No address info in DB!");
        }
    }
}