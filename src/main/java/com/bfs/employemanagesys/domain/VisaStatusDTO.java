package com.bfs.employemanagesys.domain;

import com.bfs.employemanagesys.pojo.VisaStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class VisaStatusDTO implements DTO<VisaStatus>{
    //May not need

    @Override
    public void convertToDTO(VisaStatus visaStatus) {
    }

    @Override
    public void convertToEntity(VisaStatus visaStatus) {
    }
}
