package com.microservice.course.microservice_course.servicio;

import java.util.List;

import com.microservice.course.microservice_course.entidad.Course;

public interface ICourseService {
    
    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    

    void deleteById(Long id);
}
