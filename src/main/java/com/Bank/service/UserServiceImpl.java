package com.Bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.entity.User;
import com.Bank.repository.UserRepository;


@Service
public class UserServiceImpl  implements UserService{
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUser(int id) {
		
		return userRepository.findById(id).get();
	}

	@Override
	public User createUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getAll() {
		
		return userRepository.findAll();
	}

	@Override
	public User updateUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
	
	

}
