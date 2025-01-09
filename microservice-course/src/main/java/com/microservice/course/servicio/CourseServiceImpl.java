package com.microservice.course.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.course.client.StudentClient;
import com.microservice.course.dto.StudentDTO;
import com.microservice.course.entidad.Course;
import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.repositorio.CourseRepository;
@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentClient studentClient;

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

    @Override
    public StudentByCourseResponse findStudentByCourse(Long idCourse) {

        // consultar el curso

        Course course = courseRepository.findById(idCourse).orElse(new Course());

        // obtener los estudiates

        List<StudentDTO> studentDTOList = studentClient.findAllStudentByCourse(idCourse);

        return StudentByCourseResponse.builder()
                .courseName(course.getNameCourse())
                .teacher(course.getTeacher())
                .studentDTOList(studentDTOList)

                .build();
    }

}
