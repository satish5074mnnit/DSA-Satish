package com.facebook.springjpa.controller;

import com.facebook.springjpa.DAO.User;
import com.facebook.springjpa.model.UserModel;
import com.facebook.springjpa.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class jpaController {

    @Autowired
    userService userService;

    @GetMapping("/{id}/get")
    public User hello(@PathVariable Long id) {
        return userService.getUserRepository(id);
    }
    @PostMapping("/add/user")
    public User save(@RequestBody User user) {
        return userService.insertUser(user);
    }

    @PutMapping("/update/user")
    public User update(@RequestBody User user) {
        return userService.updateUser(user);
    }
//    @DeleteMapping("/delete/{id}/user")
//    public void delete(@PathVariable Long id) {
//        userService.deleteUser(id);
//    }

}
