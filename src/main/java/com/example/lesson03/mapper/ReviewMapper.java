package com.example.lesson03.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.domain.Review;

@Repository
public interface ReviewMapper {

	// input:id    output:Review
	public Review selectReview(int id);
	
	// input : Review    output: X or 성공한 행의 개수(int)
	public int insertReview(Review review);
	
	public int insertReviewAsField(
			// 하나의 맵이 된 것 => @param
								@Param("storeId") int storeId,
								@Param("menu") String menu,
								@Param("userName") String UserName,
								@Param("point") Double point,
								@Param("review") String review);
	
	public int updateReviewById(@Param("id") int id, @Param("review") String review);
}