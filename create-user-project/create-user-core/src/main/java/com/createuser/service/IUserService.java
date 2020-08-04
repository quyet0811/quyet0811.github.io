package com.createuser.service;

import com.createuser.dto.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> getAll();
    UserDTO insert(UserDTO userDTO);
}
