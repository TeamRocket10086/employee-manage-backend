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

    @Override
    public void convertToDTO(Employee employee) {

    }

    @Override
    public void convertToEntity(Employee employee) {

    }
}
