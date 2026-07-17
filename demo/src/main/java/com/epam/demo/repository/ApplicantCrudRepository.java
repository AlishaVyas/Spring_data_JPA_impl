package com.epam.demo.repository;

import com.epam.demo.Entity.Applicant;
import org.springframework.data.repository.ListCrudRepository;

public interface ApplicantCrudRepository extends ListCrudRepository<Applicant,Long> {

}
