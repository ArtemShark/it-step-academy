package com.company.homework_lesson_22.dao;

import com.company.homework_lesson_22.model.RentalInquiries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RentalInquiriesRepository extends JpaRepository<RentalInquiries, Long> {
}
