package com.epam.demo.repository;

import com.epam.demo.Entity.Applicant;
import org.springframework.data.repository.CrudRepository;

public interface ApplicantCrudRepository extends CrudRepository<Applicant,Long> {

}
