package com.scd.gpsapp.controller;

import com.scd.gpsapp.model.dto.UserSimpleDetailsDTO;
import com.scd.gpsapp.model.entity.User;
import com.scd.gpsapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path="/get-all")
    public List<UserSimpleDetailsDTO> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping(path="/create")
    public UserSimpleDetailsDTO createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
