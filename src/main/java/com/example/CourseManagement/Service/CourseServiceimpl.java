 package com.example.CourseManagement.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.CourseManagement.Model.Courses;
@Service
public class CourseServiceimpl implements CourseService{
    List<Courses> list;

    public CourseServiceimpl()
    {
        list=new ArrayList<>();
        list.add(new Courses(145,"Java Core Course","This course "));
        list.add(new Courses(124,"Spring boot course","creating rest api"));
    }

    @Override
    public List<Courses> getCourses() {
        return list;
    }
    public Courses getCourses(long courseId){
        Courses c=null;
        for(Courses course:list)
        {
            if(course.getId()==courseId)
            {
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Courses addCourses(Courses courses) {
        list.add(courses);
        return courses;
    }

    @Override
    public Courses updateCourse(Courses courses) {
        list.forEach(e ->{
            if(e.getId()==courses.getId()){
                e.setTitle(courses.getTitle());
                e.setDescription(courses.getDescription());
            }
        });
       return courses;
    }

    @Override
    public void deleteCourses(long parseLong) {
        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
    
    }

}
