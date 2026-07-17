package com.epam.demo.repository;

import com.epam.demo.Entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantJpaRepository extends JpaRepository<Applicant,Long> {
}
