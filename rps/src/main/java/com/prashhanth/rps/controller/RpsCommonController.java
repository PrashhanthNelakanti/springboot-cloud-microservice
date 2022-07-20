package com.prashhanth.rps.controller;


import com.prashhanth.rps.pojo.EmailMetaData;
import com.prashhanth.rps.repo.EmailMetaDataRepo;
import com.prashhanth.rps.service.EmailMetaDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/rps")
public class RpsCommonController {

    private static final String URL="/fetch/{name}/{days}";
    private static final String URL1="/sampleData";

    private static final Logger logger = LoggerFactory.getLogger(RpsCommonController.class);

    @Autowired
    EmailMetaDataService emailMetaDataService;

    @Autowired
    EmailMetaDataRepo repo;

    @GetMapping(URL)
    public ResponseEntity<?> getEmailMetaData( @PathVariable("name") String name,@PathVariable(value="days",required = false) Integer days){
        if(days==null)
            days=90;
        logger.info("Inside class RpsCommonController in meth getEmailMetaData and Params:"+days+","+name);
        List<EmailMetaData> emailMetaDataList= emailMetaDataService.getEmailMetaData(days,name);
        return ResponseEntity.status(HttpStatus.OK).body(emailMetaDataList);
    }

    @GetMapping(URL1)
    public ResponseEntity<?> sampleData(){
        EmailMetaData em= new EmailMetaData();
        em.setName("Allen"+emailMetaDataService.getDays());
        LocalDateTime date=LocalDateTime.now().minusDays(12);
        em.setEmailSentOn(date);
        repo.save(em);
        return ResponseEntity.status(HttpStatus.OK).body(em);
    }

}