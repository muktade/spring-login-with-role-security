package com.ithouse.spring.security.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ithouse.spring.security.login.entity.Role;
import com.ithouse.spring.security.login.entity.User;
import com.ithouse.spring.security.login.repo.RoleRepo;
import com.ithouse.spring.security.login.repo.UserRepo;

@Controller
@RequestMapping("/public")
public class PublicController {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private RoleRepo roleRepo;
	
	@PostMapping("/user/save")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		userRepo.save(user);
		return ResponseEntity.ok(user);
	}
	
	@PostMapping("/role/save")
	public ResponseEntity<Role> saveRole(@RequestBody Role role) {
		roleRepo.save(role);
		return ResponseEntity.ok(role);
	}

	@GetMapping("/user/get-all")
	public ResponseEntity<List<User>> getAlluser() {
		List<User> uList = userRepo.findAll();
		return ResponseEntity.ok(uList);
	}
	
	@GetMapping("/role/get-all")
	public ResponseEntity<List<Role>> getAllrole() {
		List<Role> uList = roleRepo.findAll();
		return ResponseEntity.ok(uList);
	}
	@DeleteMapping("/user/delete")
	public ResponseEntity<User> deleteUser(@RequestBody User user) {
		userRepo.deleteById(user.getId());
		return ResponseEntity.ok(user);
	}
}
