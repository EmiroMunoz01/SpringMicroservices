package com.microservice.course.servicio;

import java.util.List;

import com.microservice.course.entidad.Course;
import com.microservice.course.http.response.StudentByCourseResponse;



public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    void deleteById(Long id);

    // debemos crear una respuesta personalizada que vamos a responder en nuestro
    // microservicio

    StudentByCourseResponse findStudentByCourse(Long idCourse);
}
