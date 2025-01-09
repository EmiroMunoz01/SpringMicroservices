package com.microservice.course.microservice_course.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.course.microservice_course.entidad.Course;
import com.microservice.course.microservice_course.repositorio.CourseRepository;

public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);

    }

    @Override
    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }

}
