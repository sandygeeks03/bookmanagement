package com.mobi.dao;

import org.springframework.data.repository.CrudRepository;

import com.mobi.model.User;

public interface UserDao extends CrudRepository<User, Integer> {

}
