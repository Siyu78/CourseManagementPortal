package com.example.CourseManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CourseManagement.Model.Courses;
import java.util.List;
import java.util.Optional;

@Repository
public interface CourseDao extends JpaRepository<Courses,Long>{

    Optional<Courses> findById(long id);

}
