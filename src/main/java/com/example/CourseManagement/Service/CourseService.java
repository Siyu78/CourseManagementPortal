package com.example.CourseManagement.Service;

import java.util.List;

import com.example.CourseManagement.Model.Courses;

public interface CourseService {
    public List<Courses> getCourses();
    public Courses getCourses(long courseId);
    public Courses addCourses(Courses courses);
    public Courses updateCourse(Courses courses);
    public void deleteCourses(long courses);

}
