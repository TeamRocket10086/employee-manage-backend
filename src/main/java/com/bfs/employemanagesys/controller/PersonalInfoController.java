package com.bfs.employemanagesys.controller;

import com.bfs.employemanagesys.domain.PersonDTO;
import com.bfs.employemanagesys.domain.PersonalInfoResponse;
import com.bfs.employemanagesys.domain.ServiceStatus;
import com.bfs.employemanagesys.service.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonalInfoController {
    //Assume JWT in cookie provides most data from User table such as userid, personid, etc.

    private PersonalInfoService personService;
    @Autowired
    public void setPersonService(PersonalInfoService pService){
        personService = pService;
    }

    public int getPersonID(){
        return 1;
    }

    @GetMapping("/personalinfo")
    public PersonalInfoResponse getAllInfo(){
        int pid = getPersonID();
        PersonalInfoResponse response = new PersonalInfoResponse();
        response.setPerson(personService.getPerson(pid));
        response.setResponseContacts(personService.getContacts(pid));
        response.setResponseAddresses(personService.getAddresses(pid));
        prepareResponse(response, true, "");
        //System.out.println(response);
        return response;
    }

    @PutMapping("/personalinfo/person")
    public void updatePerson(@RequestBody PersonDTO person){
        //int pid = person.getId();
        int pid = getPersonID();
        personService.updatePerson(person, pid);
    }

    private void prepareResponse(PersonalInfoResponse response, boolean success, String errorMessage) {
        response.setServiceStatus(new ServiceStatus(success ? "SUCCESS" : "FAILED", success, errorMessage));
    }
    /*
    @GetMapping("/concert/all")
    public ConcertResponse getAllConcerts(){
        ConcertResponse response = new ConcertResponse();
        response.setConcertList(concertService.getAllConcerts());
        prepareResponse(response, true, "");
        System.out.println(response);
        return response;
    }

    //    /concert/1
    @GetMapping("/concert/{id}")
    public ConcertResponse getConcertById(@PathVariable Integer id){
        ConcertResponse response = new ConcertResponse();
        response.setConcert(concertService.getConcertById(id));
        prepareResponse(response, true, "");
        System.out.println(response);
        return response;
    }

    //   /concert?concert_id=1
    @PostMapping("/concert")
    public ConcertResponse getConcertById2(@RequestParam("concert_id") Integer id){
        ConcertResponse response = new ConcertResponse();
        response.setConcert(concertService.getConcertById(id));
        prepareResponse(response, true, "");
        System.out.println(response);
        return response;
    }

    //   /reservation?user_id=1
    @PostMapping("/reservation")
    public ConcertResponse getReservationByUser(@RequestParam("user_id") Integer id){
        ConcertResponse response = new ConcertResponse();
        response.setReservationlist(concertService.getReservationByUserid(id));
        prepareResponse(response, true, "");
        System.out.println(response);
        return response;
    }

    //   /reservation/1?count=5
    @PostMapping("/reservation/{user_id}")
    public ConcertResponse makeReservationByUser(@PathVariable Integer user_id, @RequestParam("count") Integer count){
        ConcertResponse response = new ConcertResponse();
        int res = concertService.makeReservation(user_id, count);
        response.setReservationlist(concertService.getReservationByUserid(user_id));//check reservations
        if(res == 1)
            prepareResponse(response, true, "");
        else
            prepareResponse(response, false, "No enough tickets!");
        System.out.println(response);
        return response;
    }


     */
}
