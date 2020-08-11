package com.createuser.service;

import com.createuser.dto.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> getAll();
    /*List<UserDTO> getUserByName(String userName);*/
    // UserDTO getUserFollowID(Long id);
    UserDTO insert(UserDTO userDTO);
    UserDTO update(UserDTO userDTO);
    void deleteUser(long ids);
    // int getTotalItems(String searchValue);*/
}
