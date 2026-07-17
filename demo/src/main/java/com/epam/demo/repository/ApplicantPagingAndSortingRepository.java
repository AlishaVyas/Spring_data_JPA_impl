package com.epam.demo.repository;

import com.epam.demo.Entity.Applicant;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicantPagingAndSortingRepository extends PagingAndSortingRepository<Applicant,Long> {
}
