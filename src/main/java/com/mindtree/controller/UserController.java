package com.mindtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.entity.User;
import com.mindtree.service.Userservice;

@RestController
@RequestMapping({"/api"})
public class UserController {

	@Autowired
	Userservice userservice ;
	
	@PostMapping(path= {"/create"})
    public User create(@RequestBody User user){
        return userservice.create(user);
    }
	
	@GetMapping(path= {"/findAll"})
    public List findAll(){
        return userservice.findAll();
    }
	
}
