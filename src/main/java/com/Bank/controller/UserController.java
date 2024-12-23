package com.Bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.entity.User;
import com.Bank.service.UserService;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	
	private  UserService userService;
	
	
	@GetMapping("/getUser")
	public User getUser(@PathVariable int id)
	{
		return userService.getUser(id);
	}
	@PostMapping("/save")
	public User CreateUSer(@RequestBody User user)
	{
		return  userService.createUser(user); 
	}
	@PutMapping("save/{id}")
	public User updateUser(@PathVariable User user)
	{
		return userService.updateUser(user);
	
		
	
	}
	@DeleteMapping("/delete")
	public void deleteUSer(@PathVariable int id)
	{
		userService.deleteUser(id);
	}
	@GetMapping("/getAll")
	public List<User> getAll(User user)
	{
		return userService.getAll();
	}
	
	
	

}
