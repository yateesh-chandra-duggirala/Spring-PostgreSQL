package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import java.util.*;

public class UserServiceImpl implements UserService {
	@Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getUserById(Long userId) {
        Optional<UserEntity> userOpt = userRepository.findById(userId);
        if(userOpt.isPresent())
            return userOpt.get();
        else
            throw new RuntimeException("user not found.");
    }

    @Override
    public void saveUser(UserEntity user) {
        UserEntity userDetail = userRepository.save(user);
        System.out.println("user saved to db with userId : " + userDetail.getId());
    }

    @Override
    public void updateUser(UserEntity user, Long userId) {
        Optional<UserEntity> userDetailOpt = userRepository.findById(userId);
        if(userDetailOpt.isPresent()){
            UserEntity userDetail = userDetailOpt.get();
            if(user.getName() != null || user.getName().isEmpty())
                userDetail.setName(user.getName());
            if(user.getPassword() != null || user.getPassword().isEmpty())
                userDetail.setPassword(user.getPassword());
            if(user.getCity() != null || user.getCity().isEmpty())
                userDetail.setCity(user.getCity());
            userRepository.save(userDetail);
        }else{
            throw new RuntimeException("user not found.");
        }
    }

    @Override
    public void deleteUseryId(Long userId) {
        Optional<UserEntity> userOpt = userRepository.findById(userId);
        if(userOpt.isPresent())
            userRepository.deleteById(userId);
        else
            throw new RuntimeException("user not found.");
    }
}
