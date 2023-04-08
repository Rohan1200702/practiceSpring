package com.gl.student.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.student.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {
}
