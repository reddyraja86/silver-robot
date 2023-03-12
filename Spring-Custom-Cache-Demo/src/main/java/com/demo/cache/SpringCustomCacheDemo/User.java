package com.demo.cache.SpringCustomCacheDemo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "registration_users")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_generator")
	@SequenceGenerator(name = "users_generator", sequenceName = "registration_users_seq", allocationSize = 1)
	private int id;

	private String username;
	private String first_name;
	private String last_name;
	private String email;
	private String mobile;
	private String salary;
}