package com.flm.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
	private Long userId;
	private String firstName;
	private String lastName;
	private String gender;
	private LocalDate dateOfBirth;
	private String mobileNumber;
	private String emailId;
	private String username;
	private String password;
	private LocalDateTime userCreatedAt;
	private String accountStatus;
	
	public Users(String firstName, String lastName, String gender, LocalDate dateOfBirth, String mobileNumber,
			String emailId, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.username = username;
		this.password = password;
	}
}
