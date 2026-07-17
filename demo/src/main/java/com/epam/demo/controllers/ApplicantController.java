package com.epam.demo.controllers;

import com.epam.demo.Entity.Applicant;
import com.epam.demo.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/applicants")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @GetMapping
    public List<Applicant> getAllApplicants() {
        return applicantService.getAllApplicants();
    }
// Save applicant (CrudRepository)
    @PostMapping
    public Applicant saveApplicant(@RequestBody Applicant applicant) {
        return applicantService.saveApplicantCrud(applicant);
    }

    @GetMapping("/page")
    public Iterable<Applicant> getApplicantWithPagination(@RequestParam int page, @RequestParam int size){
        return applicantService.getApplicantsWithPagination(page,size);
    }

    @GetMapping("/getByStatus")
    public List<Applicant> getApplicantsByStatus(@RequestParam String status) {
        return applicantService.getAllApplicantsByStatus(status);
    }

}
