package com.best.bright.onile_course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.best.bright.onile_course.model.Level_vedio;
@Repository
public interface Level_vedioRepository extends JpaRepository<Level_vedio, Long> {

}
