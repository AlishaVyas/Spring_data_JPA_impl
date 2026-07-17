package com.epam.demo.repository;

import com.epam.demo.Entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicantJpaRepository extends JpaRepository<Applicant,Long> {
    List<Applicant> findByStatus(String status);
}
