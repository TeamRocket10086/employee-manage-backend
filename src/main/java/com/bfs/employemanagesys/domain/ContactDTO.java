package com.bfs.employemanagesys.domain;

import com.bfs.employemanagesys.pojo.Contact;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO  implements DTO<Contact> {
    private boolean isReferrence;
    private boolean isEmergency;
    private boolean isLandlord;
    private String relationship;
    private String name;
    private String email;
    private String phone;
    private int id = 0; // use primitive here to ensure there must be a value

    @Override
    public void convertToDTO(Contact contact) {
        isReferrence = contact.getIsReferrence();
        isEmergency = contact.getIsEmergency();
        isLandlord = contact.getIsLandlord();
        relationship = contact.getRelationship();
        name = contact.getName();
        email = contact.getEmail();
        phone = contact.getPhone();
        id = contact.getId();
    }

    @Override
    public void convertToEntity(Contact contact) {
        if(this.email != null && this.email.length() > 0)
            contact.setEmail(email);
        contact.setIsEmergency(isEmergency);
        contact.setIsLandlord(isLandlord);
        contact.setIsReferrence(isReferrence);
        if(this.name != null && this.name.length() > 0)
            contact.setName(name);
        if(this.phone != null && this.phone.length() > 0)
            contact.setPhone(phone);
        if(this.relationship != null && this.relationship.length() > 0)
            contact.setRelationship(relationship);
    }
}
