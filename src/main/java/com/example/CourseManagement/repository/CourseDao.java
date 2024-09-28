package com.example.CourseManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CourseManagement.Model.Courses;

public interface CourseDao extends JpaRepository<Courses,Long>{

    

}
