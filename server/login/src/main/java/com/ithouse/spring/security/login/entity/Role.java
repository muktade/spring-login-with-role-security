package com.ithouse.spring.security.login.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_ROLE")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
//	@ManyToMany(mappedBy = "roles")
//	private Collection<User> users;
	
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
//	public Collection<User> getUsers() {
//		return users;
//	}
//	public void setUsers(Collection<User> users) {
//		this.users = users;
//	}
	
}
