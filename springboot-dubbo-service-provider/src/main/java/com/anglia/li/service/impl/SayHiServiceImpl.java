package com.anglia.li.service.impl;


import org.apache.dubbo.config.annotation.Service;

import com.anglia.li.bean.User;
import com.anglia.li.service.CallbackListener;
import com.anglia.li.service.SayHiService;

@Service
public class SayHiServiceImpl implements SayHiService{

	@Override
	public String sayHiToUser(String name) {

		System.out.println("ninhao");
		return "你好，"+name;
	}

	@Override
	public String findUser(User user, CallbackListener back) {
		back.callback("lipeizhi ");
		return "我是";
	}
	
	

}
