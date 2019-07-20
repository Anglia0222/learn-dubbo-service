package com.anglia.li.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anglia.li.bean.User;
import com.anglia.li.service.CallbackListener;
import com.anglia.li.service.SayHiService;

@Controller
@RequestMapping("/user")
public class SayHiController {
	
	
	@Autowired
	SayHiService sayHiService;
	
	@RequestMapping("/sayHi/{name}")
	@ResponseBody
	public void sayHi(@PathVariable("name")String name){
		
		try {
			sayHiService.sayHiToUser(name);
			
			User u = new User();
			u.setAge(18);
			u.setName("li");
			
			
			sayHiService.findUser(u, new CallbackListener() {
				
				@Override
				public void callback(String message) {
					// TODO Auto-generated method stub
					System.out.println(message);
					
				}
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
