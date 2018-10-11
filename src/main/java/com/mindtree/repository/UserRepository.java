package com.mindtree.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.mindtree.entity.User;


public interface UserRepository extends Repository<User, Long>  {
	
    User save(User user);

    List findAll();

}
