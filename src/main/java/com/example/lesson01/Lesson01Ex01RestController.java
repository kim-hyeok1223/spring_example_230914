package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController // @Controller + ResponseBody ㅈㄴ중요함 responsebody의 역할을 잘 알고 있어야 함.
public class Lesson01Ex01RestController {
	
	// URL : http://localhost/lesson01/ex01/3
	@RequestMapping("/3")
	public String ex01_3() {
		return "@RestController를 사용해 String을 리턴해본다.";
	}
	
	// URL : http://localhost/lesson01/ex01/4
	@RequestMapping("/4")
	public Map<String, String> ex01_4() {
		Map <String, String> map = new HashMap<>();
		map.put("aaa", "111");
		map.put("bbb", "222");
		map.put("ccc", "333");
		return map; // => JSON
	}
	
	
	// URL : http://localhost/lesson01/ex01/5
	@RequestMapping("/5")
	public Data ex01_5() {
		Data data = new Data(); // 일반 자바 bean(객체)
		data.setId(10);
		data.setName("김진혁");
		
		return data; 
	}
	
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6() {
		Data data = new Data();
		data.setId(11);
		data.setName("김진혁");
		
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR); // ok- 200 / Internal_server_error - 500 
	}
}
