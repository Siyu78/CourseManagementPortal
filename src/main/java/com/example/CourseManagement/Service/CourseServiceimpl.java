 package com.example.CourseManagement.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CourseManagement.Model.Courses;
import com.example.CourseManagement.repository.CourseDao;
@Service
public class CourseServiceimpl implements CourseService{
    @Autowired
    private CourseDao courseDao;
    //List<Courses> list;

    public CourseServiceimpl()
    {
        // list=new ArrayList<>();
        // list.add(new Courses(145,"Java Core Course","This course "));
        // list.add(new Courses(124,"Spring boot course","creating rest api"));
    }

    @Override
    public List<Courses> getCourses() {
        return courseDao.findAll();
    }
   
    public Optional<Courses> getCourses(long courseId){
        // Courses c=null;
        // for(Courses course:list)
        // {
        //     if(course.getId()==courseId)
        //     {
        //         c=course;
        //         break;
        //     }
        // }
        return courseDao.findById(courseId);
    }

    @Override
    public Courses addCourses(Courses courses) {
        // list.add(courses);
        courseDao.save(courses);
        return courses;
    }

    @Override
    public Courses updateCourse(Courses courses) {
        // list.forEach(e ->{
        //     if(e.getId()==courses.getId()){
        //         e.setTitle(courses.getTitle());
        //         e.setDescription(courses.getDescription());
        //     }
        // });
        courseDao.save(courses);
       return courses;
    }

    @Override
    public void deleteCourses(long parseLong) {
        // list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
    
        
        Courses entity=courseDao.getOne(parseLong);
        courseDao.delete(entity);
    }

}
