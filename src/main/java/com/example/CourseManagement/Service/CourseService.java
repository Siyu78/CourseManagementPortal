package com.example.CourseManagement.Service;

import java.util.List;
import java.util.Optional;

import com.example.CourseManagement.Model.Courses;

public interface CourseService {
    public List<Courses> getCourses();
    public Optional<Courses> getCourses(long courseId);
    public Courses addCourses(Courses courses);
    public Courses updateCourse(Courses courses);
    public void deleteCourses(long courses);

}
