package com.mindtree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.entity.User;
import com.mindtree.repository.UserRepository;

@Service
@Transactional(readOnly = false)
public class UserServiceImpl implements Userservice {

	 @Autowired
	 UserRepository repository;
	 
	 @Transactional	
	 public User create(User user) {
		return repository.save(user);
	}

	 @Transactional
	 public List findAll() {
        return repository.findAll();
    }

	

}
