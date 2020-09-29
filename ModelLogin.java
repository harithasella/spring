package com.pack.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class ModelLogin 
{
 @NotNull
private Integer id;
 @NotEmpty
 @Size(min=6,max=12)
 private String name;
 @NotEmpty
 @Size(min=5,max=10)
 private String password;
 @NotEmpty
 private String email;
 @NotEmpty
 private String gender;
 @NotEmpty
 private String subject;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}

 
 
}
