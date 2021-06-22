package com.crud.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.crud.dao.UserRepository;
import com.crud.crud.entities.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repo;
	
	public List<User> getUsers(){
		return repo.findAll();
	}
	
	public User getUser(long id) {
		return repo.getById(id);
	}
	
	public User addUser(User user) {
		repo.save(user);
		return user;
	}
	
	public User updateUser(User user) {
		repo.save(user);
		return user;
	}
	
	public void deleteUser(long id) {
		User u = repo.getById(id);
		repo.delete(u);
	}
}
