package com.swiftbeard.postgresql.dao;

import com.swiftbeard.postgresql.entities.Course;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;
public interface CourseDAO extends CrudRepository<Course, UUID> {}
