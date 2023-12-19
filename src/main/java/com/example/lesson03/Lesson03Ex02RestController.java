package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.domain.Review;

@RestController
public class Lesson03Ex02RestController {

	@Autowired
	private ReviewBO reviewBO;
	
	// insert 예제임
	// url : http://localhost/lesson03/ex02
	@RequestMapping("/lesson03/ex02")
	public String ex02() {
		Review review = new Review();
		review.setStoreId(7);
		review.setMenu("삼겹혼밥세트");
		review.setUserName("김진혁");
		review.setPoint(4.5);
		review.setReview("혼자 먹기 딱 적당하네요");
		
		// insert후 성공한 row수를 return받음
		int rowCount = reviewBO.addReview(review);
		
		return "성공한 행의 개수 : " + rowCount;
	}
	
	// url : http://localhost/lesson03/ex02/1
	@RequestMapping("/lesson03/ex02/1")
	public String ex02_1() {
		int rowCount = reviewBO.addReviewAsField(4, "콤비네이션R","김지녘",5.0,"마싯누");
		
		return "성공한 행의 개수 : " + rowCount;
	}
	
}
