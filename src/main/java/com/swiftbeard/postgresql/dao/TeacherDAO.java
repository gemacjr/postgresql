package com.swiftbeard.postgresql.dao;


import com.swiftbeard.postgresql.entities.Teacher;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;
public interface TeacherDAO extends CrudRepository<Teacher, UUID> {}
