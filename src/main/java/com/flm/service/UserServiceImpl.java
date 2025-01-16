package com.flm.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flm.dao.UserDao;
import com.flm.entity.Users;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void saveUser(Users user) {
		LocalDateTime userCreatedAt = LocalDateTime.now();
		user.setUserCreatedAt(userCreatedAt);
		user.setAccountStatus("active");
		userDao.saveUser(user);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateUser(Users user) {
		userDao.updateUser(user);		
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteUser(Long id) {
		userDao.deleteUser(id);		
	}

	@Override
	@Transactional(rollbackFor = Exception.class, readOnly = true)
	public Users getUser(Long id) {
		return userDao.getUser(id);
	}

	@Override
	@Transactional(rollbackFor = Exception.class, readOnly = true)
	public List<Users> getAllUsers() {
		return userDao.getAllUsers();
	}

}
