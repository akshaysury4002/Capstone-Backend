package com.sac.project.service;

import com.sac.project.dto.LoginDto;
import com.sac.project.dto.UserDto;
import com.sac.project.util.LoginMesage;

public interface UserService {
    String addUser(UserDto userDto);
 
    LoginMesage loginUser(LoginDto loginDto);
 
}