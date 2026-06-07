package com.company.homework_lesson_22.dao;

import com.company.homework_lesson_22.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
