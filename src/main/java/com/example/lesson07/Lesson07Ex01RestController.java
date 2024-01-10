package com.example.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson04.domain.Student;
import com.example.lesson07.entity.StudentEntity;

@RequestMapping("/lesson07/ex01")
@RestController
public class Lesson07Ex01RestController {

	
	@Autowired
	private StudentBO studentBO;
	
	// c: create
	@GetMapping("/1")
	public StudentEntity create() {
		String name = "김김김";
		String phoneNumber = "010-0101-1010";
		String email = "baba@naver.com";
		String dreamJob = "개발자";
		
		// 방금 인서트 된 pk id도 바로 얻어낼 수 있다.
		return studentBO.addStudent(name, phoneNumber, email, dreamJob);
	}
	
	// U : update
	@GetMapping("/2")
	public StudentEntity update() {
		// id가 2번인 dreamjob 변경
		// 2, 디자이너
		return studentBO.updateStudentDreamJobById(2, "디자이너");
	}
	
	// D : delete
	@GetMapping("/3")
	public String delete() {
		
		studentBO.deleteStudentById(3);
		return "삭제 완료";
	}
	
}
