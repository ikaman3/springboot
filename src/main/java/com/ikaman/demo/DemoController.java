package com.ikaman.demo;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
  @GetMapping("/demo")
  public List<Course> retrieveAllCourses() {
    return Array.asList(
      new Course()
    )
  }
}
