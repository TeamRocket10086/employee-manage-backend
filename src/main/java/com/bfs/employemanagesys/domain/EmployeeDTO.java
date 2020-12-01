package com.bfs.employemanagesys.domain;

import com.bfs.employemanagesys.pojo.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO implements DTO<Employee> {
    //May not need to set
    //public Integer personId;
    //public Integer visaId;

    //Need to set
    public String title;
    public String startDate;
    public String endDate;
    public String avatar;
    public String car;
    public String visaStartDate;
    public String visaEndDate;
    public String driverLicense;
    public String driverLicenseExpirationDate;
    private int eid = 0; // use primitive here to ensure there must be a value

    //Extra info from other tables
    public String visaTitle;

    @Override
    public void convertToDTO(Employee employee) {
        title = employee.getTitle();
        startDate = employee.getStartDate();
        endDate = employee.getEndDate();
        avatar = employee.getAvatar();
        car = employee.getCar();
        visaStartDate = employee.getVisaStartDate();
        visaEndDate = employee.getVisaEndDate();
        driverLicense = employee.getDriverLisence();
        driverLicenseExpirationDate = employee.getDriverLisenceExpirationDate();
        eid = employee.getId();

        visaTitle = employee.getVisaStatus().getVisaType();
        System.out.println("visaTitle: " + visaTitle);
    }

    @Override
    public void convertToEntity(Employee employee) {
        if(this.title != null && this.title.length() > 0)
         employee.setTitle(title);
        if(this.startDate != null && this.startDate.length() > 0)
         employee.setStartDate(startDate);
        if(this.endDate != null && this.endDate.length() > 0)
         employee.setEndDate(endDate);
        if(this.avatar != null && this.avatar.length() > 0)
         employee.setAvatar(avatar);
        if(this.car != null && this.car.length() > 0)
         employee.setCar(car);
        if(this.visaStartDate != null && this.visaStartDate.length() > 0)
         employee.setVisaStartDate(visaStartDate);
        if(this.visaEndDate != null && this.visaEndDate.length() > 0)
         employee.setVisaEndDate(visaEndDate);
        if(this.driverLicense != null && this.driverLicense.length() > 0) //not sure about the format check
         employee.setDriverLisence(driverLicense);
        if(this.driverLicenseExpirationDate != null && this.driverLicenseExpirationDate.length() > 0)
         employee.setDriverLisenceExpirationDate(driverLicenseExpirationDate);
        if(this.eid > 0)
         employee.setId(eid);
    }
}
