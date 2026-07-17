package com.epam.demo.service;


import com.epam.demo.Entity.Applicant;
import com.epam.demo.repository.ApplicantCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantCrudRepository applicantCrudRepository;

    public List<Applicant> getAllApplicants(){
        Iterable<Applicant> all =  applicantCrudRepository.findAll();
        List<Applicant> applicantList = new ArrayList<>();
        all.forEach(applicantList::add);
        return applicantList;
    }

    public Applicant  saveApplicantCrud(Applicant applicant){
        return applicantCrudRepository.save(applicant);

    }

}





