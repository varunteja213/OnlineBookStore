package com.flm.dao;

import java.util.List;

import com.flm.entity.Users;

public interface UserDao {
	
	void saveUser(Users user);
	
	void updateUser(Users user);

	void deleteUser(Long userId);
	
	Users getUser(Long userId);
	
	List<Users> getAllUsers();
}
