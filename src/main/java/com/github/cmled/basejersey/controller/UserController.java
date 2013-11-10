package com.github.cmled.basejersey.controller;

import javax.ws.rs.Path;


import com.github.cmled.basejersey.model.User;

@Path("/user")
public class UserController extends BaseController<User>{
	
	public UserController() {
		initGenericService(User.class);
	}
}
