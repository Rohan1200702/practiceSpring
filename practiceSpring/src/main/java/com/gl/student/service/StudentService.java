package com.gl.student.service;

import java.util.List;

import com.gl.student.model.Student;

public interface StudentService {
	public List<Student> getAllStudents();

	public Student saveStudent(Student student);

	public Student getStudentById(int id);

	public Student updateStudent(Student student, int id);

	public void deleteStudentById(int id);
}
