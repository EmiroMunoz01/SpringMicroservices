package com.microservice.course.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.microservice.course.entidad.Course;


public interface CourseRepository extends CrudRepository<Course, Long> {

}
