package com.example.WebbanhangNhom21.service;

import com.example.WebbanhangNhom21.model.User;
import com.example.WebbanhangNhom21.repository.IRoleRepository;
import com.example.WebbanhangNhom21.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IRoleRepository roleRepository;
    public void save(User user){
        userRepository.save(user);
        Long userId = userRepository.getUserIdByUsername(user.getUsername());
        Long roleId = roleRepository.getRoleIdByName("USER");
        if(roleId != 0 && userId !=0){
            userRepository.addUserRole(userId, roleId);
        }
    }
}

