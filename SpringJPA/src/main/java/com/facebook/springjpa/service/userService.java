package com.facebook.springjpa.service;

import com.facebook.springjpa.DAO.User;
import com.facebook.springjpa.model.UserModel;
import com.facebook.springjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {

    @Autowired
    UserRepository userRepository;

    public User getUserRepository(Long id) {
       return userRepository.getReferenceById(id);

    }

    public User insertUser(User user1) {
        return userRepository.save(user1);

    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }



}
