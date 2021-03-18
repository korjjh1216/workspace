package com.example.demo.uss.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="User")
public class User  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_no")
	private long userNo;
	
	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;
	
	@Column(name = "authority")
	private String authority;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "birthday")
	private String birthday;
	
	@Column(name = "gender")
	private String gender;

	}
