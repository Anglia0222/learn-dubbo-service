package com.anglia.li.service;

import javax.validation.constraints.NotNull;

import com.anglia.li.bean.User;

public interface SayHiService {
	
	@interface SayHiToUser{}
	public String sayHiToUser(@NotNull String name);
	
	
	public String findUser(User user,CallbackListener back);

}
