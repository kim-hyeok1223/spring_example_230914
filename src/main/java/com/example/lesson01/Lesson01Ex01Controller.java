package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01") // 메소드 위에 붙은 패스보다 먼저 읽혀진다.
@Controller // Spring bean (객체)으로 등록 (클래스 만들고 해야 할 1순위)
public class Lesson01Ex01Controller {
	
	// String을 브라우저에 출력
	// url : http://localhost/lesson01/ex01/1
	@RequestMapping("/1")
	@ResponseBody // 리턴되는 값을 response body에 넣어 보낸다. => HTML 
	public String ex01_1() {
		return "<h2>예제1</h2>문자열을 Response Body로 보내는 예제";
	}
	
	//Map 출력 => JSON String 출력
	// url : http://localhost/lesson01/ex01/2
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> ex01_2() { //메소드 위에 어노테이션 붙이기 (최근방식임)
		Map<String, Object> map = new HashMap<>();
		map.put("사과", 4);
		map.put("포도", 32);
		map.put("멜론", 1);
		map.put("딸기", 15);
		// map을 리턴하면 json으로 나타남.
		// web starter에 jackson 라이브러리가 포함되어 있기 때문에.
		return map;
	}
}
