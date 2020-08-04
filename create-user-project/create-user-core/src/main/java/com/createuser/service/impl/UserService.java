package com.createuser.service.impl;

import com.createuser.converter.UserConverter;
import com.createuser.dto.UserDTO;
import com.createuser.entity.UserEntity;
import com.createuser.repository.UserRepository;
import com.createuser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserConverter userConverter;
    @Override
    public List<UserDTO> getAll() {
        List<UserEntity> userEntities = userRepository.findAll();
        List<UserDTO> userDTOS= new ArrayList<>();
        for(UserEntity item: userEntities){
            UserDTO result = userConverter.convertToDto(item);
            userDTOS.add(result);
        }
        return userDTOS;
    }

    @Override
    public UserDTO insert(UserDTO userDTO) {
        UserEntity userEntity = userConverter.convertToEntity(userDTO);
        userEntity = userRepository.save(userEntity);
        return userConverter.convertToDto(userEntity);
    }

}
