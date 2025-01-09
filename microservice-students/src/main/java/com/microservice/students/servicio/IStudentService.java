package com.microservice.students.servicio;

import java.util.List;

import com.microservice.students.entidad.Student;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    List<Student> findByIdCourse(Long idCourse);

    void deleteById(Long id);

}
