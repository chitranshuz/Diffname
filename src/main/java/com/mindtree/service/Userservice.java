package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.User;

public interface Userservice {

	User create(User user);

	List findAll();

}
