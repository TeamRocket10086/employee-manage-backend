package com.bfs.employemanagesys.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class EmployeeDTO {
    public Integer personId;
    public String title;
    public String startDate;
    public String endDate;
    public String avatar;
    public String car;
    public String visaStartDate;
    public String visaEndDate;
    public String driverLicense;
    public String driverLicenseExpirationDate;

}
