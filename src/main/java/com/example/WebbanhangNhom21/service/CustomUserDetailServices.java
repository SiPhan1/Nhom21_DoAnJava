package com.example.WebbanhangNhom21.service;

import com.example.WebbanhangNhom21.model.CustomUserDetail;
import com.example.WebbanhangNhom21.model.User;
import com.example.WebbanhangNhom21.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailServices implements UserDetailsService {

    @Autowired
    private IUserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user == null){
            throw  new UsernameNotFoundException(username);
        }
        return new CustomUserDetail(user, userRepository);
    }
}