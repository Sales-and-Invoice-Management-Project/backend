package com.app.service;

import com.app.entity.UserEntity;

public interface IUsersService {
	
	UserEntity authenticateUser(String userName, String password);	

}
