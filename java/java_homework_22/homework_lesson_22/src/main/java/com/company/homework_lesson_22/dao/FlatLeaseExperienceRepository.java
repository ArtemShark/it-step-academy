package com.company.homework_lesson_22.dao;

import com.company.homework_lesson_22.model.FlatLeaseExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface FlatLeaseExperienceRepository extends JpaRepository<FlatLeaseExperience, Long> {
}
