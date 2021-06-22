package com.crud.crud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.crud.entities.User;

@Service
public interface UserService {

	public List<User> getUsers();
	public User getUser(long id);
	public User addUser(User user);
	public User updateUser(User user);
	public void deleteUser(long id);
}
