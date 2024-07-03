package com.codingdojo.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="books")
public class Books {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@NotNull
@Size(min=3, message = "Title Must be at least 3 charachters")
private String title;

@NotNull
@Size(min =3, message = "Author Name Must be at least 3 charachters")
private String author_name;

@NotNull
@Size(min = 3, message = "Thoughts Name Must be at least 3 charachters")
private String thoughts;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="userId")
private User user;


public Books() {
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public String getAuthor_name() {
	return author_name;
}


public void setAuthor_name(String author_name) {
	this.author_name = author_name;
}


public String getThoughts() {
	return thoughts;
}


public void setThoughts(String thoughts) {
	this.thoughts = thoughts;
}


public User getUser() {
	return user;
}


public void setUser(User user) {
	this.user = user;
}


}


