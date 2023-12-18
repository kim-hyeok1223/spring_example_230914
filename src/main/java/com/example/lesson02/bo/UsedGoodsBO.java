package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;
import com.example.lesson02.mapper.UsedGoodsMapper;

@Service // spring bean
public class UsedGoodsBO {
	
	@Autowired  // 스프링 빈을 객체로 가져오겠다 -> Dependency Injection(DI) : 의존성 주입 
	// (스프링빈은 new를 못함 그래서 스프링 빈을 내가 가져와서 여기에다가 쓰겠다라고 선언)
	private UsedGoodsMapper usedGoodsMapper; 
	
	//  input : X (컨트롤러한테 받아옴)
	// output : (Repository한테 받은 것을) List<UsedGoods> (컨트롤러한테 줌)
	public List<UsedGoods> getUsedGoodsList () {
		return usedGoodsMapper.selectUsedGoodsList(); // repository한테 하청 넘김
	}
}
