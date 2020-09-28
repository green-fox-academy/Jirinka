package com.example.todo.Service;

import com.example.todo.Repository.UserRepository;

public class UserServiceImpl implements UserService {

    public final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
