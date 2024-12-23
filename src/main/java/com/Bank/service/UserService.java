package com.Bank.service;

import java.util.List;

import com.Bank.entity.User;

public interface UserService {
	
	public User getUser(int id);
	public User createUser(User user);
	public List<User> getAll();
	public User updateUser(User  user);
	public void deleteUser(int id);
	

}
