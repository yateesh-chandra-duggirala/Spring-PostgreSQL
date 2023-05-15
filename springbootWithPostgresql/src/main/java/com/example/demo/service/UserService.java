package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import java.util.*;

public interface UserService {

		List<UserEntity> getAllUser();

	    UserEntity getUserById(Long userId);

	    void saveUser(UserEntity user);

	    void updateUser(UserEntity user, Long userid);

	    void deleteUseryId(Long userId);
}
