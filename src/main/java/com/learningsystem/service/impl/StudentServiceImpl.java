package com.learningsystem.service.impl;

import java.util.Map;

import com.learningsystem.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningsystem.dao.StudentMapper;
import com.learningsystem.pojo.Student;
import com.learningsystem.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentMapper sm;
	
	public Student queryStudentByOpenid(String openid) {
		return sm.selectByTgOpenid(openid);
	}

	public Student queryStudentByMap(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sm.selectByIdAndPassword(map);
	}

	public int uadateStudent(Student stu) {
		// TODO Auto-generated method stub
		return sm.updateByPrimaryKey(stu);
	}

	@Override
	public Integer insertStuInfo(Student student) {
		return sm.insertStuInfo(student);
	}

}