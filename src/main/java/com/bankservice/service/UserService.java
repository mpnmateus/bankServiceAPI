package com.bankservice.service;

import com.bankservice.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}

