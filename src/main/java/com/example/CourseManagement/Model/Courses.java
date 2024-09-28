package com.example.CourseManagement.Model;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@Entity
public class Courses {

   @Id
private long id;
@Column
private String title;
@Column
private String description;

public Courses( long id, String title, String description)
     {
      this.id=id;
      this.title=title;
      this.description=description;
  }
  public Courses()
{
   super();
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