package com.flm.service;

import java.util.List;

import com.flm.entity.Users;

public interface UserService {

	void saveUser(Users user);

	void updateUser(Users user);

	void deleteUser(Long id);

	Users getUser(Long id);

	List<Users> getAllUsers();
}
