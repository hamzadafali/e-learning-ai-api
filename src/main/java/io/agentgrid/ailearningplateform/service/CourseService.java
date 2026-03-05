package io.agentgrid.ailearningplateform.service;

import io.agentgrid.ailearningplateform.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final List<Course> courses = List.of(
            new Course(1L, "Introduction to Java", "Learn the fundamentals of Java programming language", 120),
            new Course(2L, "Spring Boot Masterclass", "Master Spring Boot 3.4 with hands-on projects", 240),
            new Course(3L, "Microservices Architecture", "Design and build scalable microservices", 180),
            new Course(4L, "Docker and Kubernetes", "Container orchestration for modern applications", 200)
    );

    public List<Course> getAllCourses() {
        return courses;
    }
}
