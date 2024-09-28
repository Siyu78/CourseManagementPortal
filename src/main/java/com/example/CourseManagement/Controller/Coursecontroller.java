package com.example.CourseManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CourseManagement.Model.Courses;
import com.example.CourseManagement.Service.CourseService;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Coursecontroller {
    @Autowired
    private CourseService courseService;
    // @GetMapping("/home")
    // public String home(){
    //     return "This is home page";
    // }
    //get the courses
     @GetMapping("/courses")
     public List<Courses> getCourses()
     {
       return this.courseService.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Courses getCourses(@PathVariable String courseId)
    {
       return this.courseService.getCourses(Long.parseLong(courseId));
    }
    // //Consume annotion used for data in which format
    @PostMapping("/courses")
    public Courses addCourses(@RequestBody Courses courses)
    {
        return this.courseService.addCourses(courses);
    }
    @PutMapping("/courses/{courseId}")
    public Courses updateCourse(@RequestBody Courses course)
    {
        return this.courseService.updateCourse(course);
    }
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try{
            this.courseService.deleteCourses(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
