package com.example.lesson02.bo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;

@Service // spring bean
public class UsedGoodsBO {
	
	//  input : X (컨트롤러한테 받아옴)
	// output : (Repository한테 받은 것을) List<UsedGoods> (컨트롤러한테 줌)
	public List<UsedGoods> getUsedGoodsList () {
		return ; // repository한테 하청 넘김
	}
}
