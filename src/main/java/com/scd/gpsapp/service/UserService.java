package com.scd.gpsapp.service;

import com.scd.gpsapp.model.dto.UserSimpleDetailsDTO;
import com.scd.gpsapp.model.entity.User;
import com.scd.gpsapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserSimpleDetailsDTO> getAllUsers(){

        List<UserSimpleDetailsDTO> returnList = new ArrayList<UserSimpleDetailsDTO>();

        for(User user : userRepository.findAll()){
            returnList.add(new UserSimpleDetailsDTO(user));
        }

        return returnList;
    }

    public UserSimpleDetailsDTO createUser(User user){
        User savedUser = userRepository.save(user);
        return new UserSimpleDetailsDTO(savedUser);
    }

}
