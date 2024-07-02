package com.codingdojo.demo.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table (name="users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@NotNull
@Size(min=3, message = "User Name Must be at least 3 charachters")
private String userName;

@NotNull
@Email(message = "User Email Must be at least 3 charachters")
private String email;


@NotNull(message = "Password is Requierd")
@Size(min=8, max = 128, message = "User Password Must be at least 8 charachters")
private String password;

@Transient
@NotNull(message = "Confirm Password is Requierd")
@Size(min=8, max = 128, message = "Confirm Password Must be at least 8 charachters")
private String ConfirmPassword;

@Column(updatable = false)
@DateTimeFormat(pattern = "yyyy-mm-dd")
private Date createdAt ; 

@DateTimeFormat(pattern = "yyyy-mm-dd")
private Date updatedAt ; 

@PrePersist
public void onCreate() {
	this.createdAt = new Date();
}

@PreUpdate
public void onUpdate() {
	this.updatedAt = new Date();
}

public User() {
	// TODO Auto-generated constructor stub
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getConfirmPassword() {
	return ConfirmPassword;
}

public void setConfirmPassword(String confirmPassword) {
	ConfirmPassword = confirmPassword;
}

public Date getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}

public Date getUpdatedAt() {
	return updatedAt;
}

public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}



}
