package com.bfs.employemanagesys.controller;

import com.bfs.employemanagesys.service.VisaStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/VisaStatus")
public class VisaStatusController {
    @Autowired
    VisaStatusService visaStatusService;
}
