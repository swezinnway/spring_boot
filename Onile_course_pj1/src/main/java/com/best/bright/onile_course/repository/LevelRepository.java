package com.best.bright.onile_course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.best.bright.onile_course.model.Level;
@Repository
public interface LevelRepository extends JpaRepository<Level, Long>{

}
