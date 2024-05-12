package me.dio.santander.service;

import me.dio.santander.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
