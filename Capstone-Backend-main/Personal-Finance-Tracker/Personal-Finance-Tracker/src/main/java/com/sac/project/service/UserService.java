package com.sac.project.service;

import com.sac.project.dto.UserDTO;

import com.sac.project.util.Status;

public interface UserService {
    Status registerUser(UserDTO userDto);
    Status loginUser(UserDTO userDto);
    Status logUserOut(UserDTO userDto);
    Status findByEmail(UserDTO userDto);
}

