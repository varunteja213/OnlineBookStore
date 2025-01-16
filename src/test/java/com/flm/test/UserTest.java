package com.flm.test;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flm.dao.UserDao;
import com.flm.entity.Users;
import com.flm.service.UserService;

public class UserTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		UserService userService = ctx.getBean(UserService.class);

		Users u1 = new Users("Kiran", "Shriram", "female", LocalDate.parse("2001-08-25"), "2979845",
				"kiran@gmail.com", "user4", "Techno");

//		userService.saveUser(u1);
//		System.out.println("User saved" + u1);
//		
//		u1.setLastName("Moses");
//		userService.updateUser(u1);
//		System.out.println("User Updated \n" + u1);

//		userService.deleteUser(3L);
		
//		Users user = userService.getUser(1L);
//		System.out.println("User is: "+user);

		for(Users user : userService.getAllUsers()) {
			System.out.println(user);
		}
	}
}
