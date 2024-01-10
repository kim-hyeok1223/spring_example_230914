package com.example.lesson07;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson07.entity.StudentEntity;
import com.example.lesson07.repository.StudentRepository;

@RequestMapping("/lesson07/ex02")
@RestController
public class Lesson07Ex02RestController {

	// 이번에만 BO 생략
	@Autowired
	private StudentRepository studentRepository;
	
	// 조회하는 여러가지 방법
	@GetMapping("/1")
	public List<StudentEntity> getStudentList() {
		// 1. 전체 조회(기본 제공 메소드)
		//return studentRepository.findAll();
		
		//2. id기준 내림차순 전체 조회
		//return studentRepository.findAllByOrderByIdDesc();
		
		//3. id기준 내림차순 3개만 조회
		//return studentRepository.findTop3ByOrderByIdDesc();
		
		//4. 이름 '김김김' 조회
		// return studentRepository.findByName("김김김");
		
		//5. in문으로 일치하는 값 모두 조회 (이름)
		// return studentRepository.findByNameIn(Arrays.asList("유재석", "조세호", "김김김"));
		
		//6. 여러 컬럼값과 일치하는 데이터 조회(이름, 장래희망)
		// return studentRepository.findByNameAndDreamJob("김김김", "개발자");
		
		//7. email 컬럼에 naver.com 키워드가 포함된 데이터 조회 (like문 - %naver%)
		// return studentRepository.findByEmailContaining("naver");
		
		//8. 이름이 김으로 시작하는 데이터 조회 (like문 - 김%)
		// return studentRepository.findByNameStartingWith("김");
		
		//9. id가 1 ~ 5인 데이터 조회 (between)
		return studentRepository.findByIdBetween(2, 4);
	}
	
	@GetMapping("/2")
	public List<StudentEntity> getStudent() {
		// 장래희망이 '개발자'인 데이터 조회
		return studentRepository.findByDreamJob("개발자");
	}
}
