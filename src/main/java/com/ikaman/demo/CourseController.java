package com.ikaman.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
  @GetMapping("/demo")
  public List<Course> retrieveAllCourses() {
    return Arrays.asList(
      new Course(1, "Learn AWS", "ikaman"),
      new Course(2, "Learn DevOps", "ikaman"),
      new Course(3, "Learn Java", "ikaman")
    );
  }
}
