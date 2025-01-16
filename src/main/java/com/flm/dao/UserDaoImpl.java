package com.flm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.flm.entity.Users;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	@Override
	public void saveUser(Users user) {
		getHibernateTemplate().save(user);
	}

	@Override
	public void updateUser(Users user) {
		getHibernateTemplate().update(user);
	}

	@Override
	public void deleteUser(Long userId) {
		Users user = getUser(userId);
		if (user != null) {
			getHibernateTemplate().delete(user);
		}else {
			System.out.println("No User present");
		}
	}

	@Override
	public Users getUser(Long userId) {
		return getHibernateTemplate().get(Users.class, userId);
	}

	@Override
	public List<Users> getAllUsers() {
		return getHibernateTemplate().loadAll(Users.class);
	}

}
