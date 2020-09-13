package com.best.bright.onile_course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.best.bright.onile_course.model.Student_enrolment;
@Repository
public interface Student_enrolmentRepository extends JpaRepository<Student_enrolment, Long> {

}
