package com.codingdojo.demo.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//...
@Entity
@Table(name="dojos")
public class Dojo {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String name;
 @Column(updatable=false)
 private Date createdAt;
 private Date updatedAt;
 @OneToMany(mappedBy="dojo", fetch = FetchType.LAZY)
 private List<Ninja> ninjas;
 
 public Dojo() {
     
 }
 
 public Dojo(String name) {
	 this.name = name;
 }
 // ...
 // getters and setters removed for brevity
 // ...

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
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

public List<Ninja> getNinjas() {
	return ninjas;
}

public void setNinjas(List<Ninja> ninjas) {
	this.ninjas = ninjas;
}
}


