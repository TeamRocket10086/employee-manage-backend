package com.bfs.employemanagesys.domain;

import com.bfs.employemanagesys.pojo.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO implements DTO <Address> {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String zipcode;
    private String stateName;
    private String stateAbbr;
    private boolean bePrimary;
    private int id = 0; // use primitive here to ensure there must be a value

    @Override
    public void convertToDTO(Address address) {
        addressLine1 = address.getAddressLine1();
        addressLine2 = address.getAddressLine2();
        city = address.getCity();
        zipcode = address.getZipcode();
        stateName = address.getStateName();
        stateAbbr = address.getStateAbbr();
        bePrimary = address.getIsPrimary();
        id = address.getId();
    }

    @Override
    public void convertToEntity(Address address) {
        System.out.println("From frontend" + bePrimary);
        address.setIsPrimary(bePrimary);
        System.out.println("After conversion from frontend" + address.getIsPrimary());
        if(this.addressLine1 != null && this.addressLine1.length() > 0)
            address.setAddressLine1(addressLine1);
        address.setAddressLine2(addressLine2);
        if(this.city != null && this.city.length() > 0)
            address.setCity(city);
        if(this.stateAbbr != null && this.stateAbbr.length() > 0)
            address.setStateAbbr(stateAbbr);
        if(this.stateName != null && this.stateName.length() > 0)
            address.setStateName(stateName);
        if(this.zipcode != null && this.zipcode.length() > 0)
            address.setZipcode(zipcode);
        // Do NOT transfer id here
    }
}
