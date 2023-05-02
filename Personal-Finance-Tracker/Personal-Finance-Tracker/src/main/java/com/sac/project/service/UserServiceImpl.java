package com.sac.project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sac.project.domain.User;
import com.sac.project.dto.LoginDto;
import com.sac.project.dto.UserDto;
import com.sac.project.repository.UserRepository;
import com.sac.project.util.LoginMesage;

import javax.annotation.Resource;
import java.util.Optional;

@Service

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public String addUser(UserDto userDto) {

        User user = new User(

                userDto.getUserid(),
                userDto.getUsername(),
                userDto.getEmail(),

               this.passwordEncoder.encode(userDto.getPassword())
        );

        userRepo.save(user);

        return user.getUsername();
    }
    UserDto userDto;

    @Override
    public LoginMesage loginUser(LoginDto loginDto) {
        String msg = "";
        User user1 = userRepo.findByEmail(loginDto.getEmail());
        if (user1 != null) {
            String password = loginDto.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                // Check if email and password match
                Optional<User> user = userRepo.findOneByEmailAndPassword(loginDto.getEmail(), encodedPassword);
                if (user != null) {
                    return new LoginMesage("Login Success", true);
                } else {
                    return new LoginMesage("Login Failed", false);
                }
            } else {
                return new LoginMesage("password Not Match", false);
            }
        } else {
            return new LoginMesage("Email not exists", false);
        }
    }

}

