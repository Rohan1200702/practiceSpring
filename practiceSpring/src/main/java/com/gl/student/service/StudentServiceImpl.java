package com.gl.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.student.Dao.StudentDao;
import com.gl.student.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	StudentDao stdDao;

	public StudentServiceImpl(StudentDao stdDao) {
		super();
		this.stdDao = stdDao;
	}

	@Override
	public List<Student> getAllStudents() {
		return stdDao.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return stdDao.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		return stdDao.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student, int id) {
		Student std = stdDao.findById(id).get();
		std.setFirstName(student.getFirstName());
		std.setLastName(student.getLastName());
		std.setEmail(student.getEmail());
		return stdDao.save(std);
	}

	@Override
	public void deleteStudentById(int id) {
		stdDao.deleteById(id);

	}

}
