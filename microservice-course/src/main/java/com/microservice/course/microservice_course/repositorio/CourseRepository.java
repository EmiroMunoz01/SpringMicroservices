package com.microservice.course.microservice_course.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.microservice.course.microservice_course.entidad.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {

}
