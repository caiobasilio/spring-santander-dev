package com.spring.santander_dev.service;

import com.spring.santander_dev.domain.model.User;

public interface UserService {
    User findById(long id);
    User create(User userToCreate);
}
