package com.flm.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
	private Long adminId;
	private String adminUsername;
	private String adminPassword;
	private String emailId;
	private LocalDateTime adminCreatedAt;
	
	public Admin(String adminUsername, String adminPassword, String emailId) {
		this.adminUsername = adminUsername;
		this.adminPassword = adminPassword;
		this.emailId = emailId;
	}	
}
