package com.example.CourseManagement.Model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Courses {

   
private long id;

private String title;
private String description;
public Courses( long id, String title, String description)
     {
      this.id=id;
      this.title=title;
      this.description=description;
  }
// }
// @GetMapping("/")
//     public List<Courses> getCourses()
//     {
//         return this.Courses.getCourses();
//     }
//     @GetMapping("/Courses/{courseId}")
//     public Courses getCourse(@PathVariable String courseId)
//     {
//         return this.CourseService
//     }
}