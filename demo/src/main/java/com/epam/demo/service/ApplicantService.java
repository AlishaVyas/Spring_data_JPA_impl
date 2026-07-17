package com.epam.demo.service;


import com.epam.demo.Entity.Applicant;
import com.epam.demo.repository.ApplicantCrudRepository;
import com.epam.demo.repository.ApplicantJpaRepository;
import com.epam.demo.repository.ApplicantPagingAndSortingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantCrudRepository applicantCrudRepository;

    @Autowired
    private ApplicantPagingAndSortingRepository applicantpagingAndSortingRepository;

    @Autowired
    private ApplicantJpaRepository applicantjpaRepository;

    public List<Applicant> getAllApplicants(){
        return applicantCrudRepository.findAll();
    }

    public Applicant  saveApplicantCrud(Applicant applicant){
        return applicantCrudRepository.save(applicant);

    }

    public Iterable<Applicant> getApplicantsWithPagination(int page, int size){
        return applicantpagingAndSortingRepository.findAll(PageRequest.of(page,size));
    }

    public List<Applicant> getAllApplicantsByStatus(String status){
        return applicantjpaRepository.findByStatus(status);
    }

}





