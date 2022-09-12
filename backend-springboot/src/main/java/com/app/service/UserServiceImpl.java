package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserRepository;
import com.app.entity.UserEntity;


@Service
@Transactional
public class UserServiceImpl implements IUsersService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserEntity authenticateUser(String userName, String password) {
		Optional<UserEntity> optional = userRepo.findByUserNameAndPassword(userName, password);
		System.out.println(optional);
		
		return optional.orElseThrow(()-> new RuntimeException("User not found"));
	}

}
