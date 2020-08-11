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

    /*@Override
    public List<UserDTO> getUserByName(String userName) {
        List<UserEntity> userEntities = userRepository.findAll(userName);
        List<UserDTO> userDTOS= new ArrayList<>();
        for(UserEntity item: userEntities){
            UserDTO result = userConverter.convertToDto(item);
            userDTOS.add(result);
        }
        return userDTOS;
    }
*/
  /*  @Override
    public UserDTO getUserFollowID(Long id) {
        UserDTO userDTO = userConverter.convertToDto(userRepository.findOne(id));
        return userDTO;
    }*/

    @Override
    public UserDTO insert(UserDTO userDTO) {
        UserEntity userEntity = userConverter.convertToEntity(userDTO);
        userEntity = userRepository.save(userEntity);
        return userConverter.convertToDto(userEntity);
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        UserEntity userEntity = userRepository.findOne(userDTO.getId());
        userEntity.setUserName(userDTO.getUserName());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setPhone(userDTO.getPhone());
        userEntity.setRole_id(userDTO.getRole_id());
        userEntity.setAvatar(userDTO.getAvatar());
        userEntity = userRepository.save(userEntity);
        return userConverter.convertToDto(userEntity);
    }

    @Override
    public void deleteUser(long ids) {
        UserEntity userEntity = userRepository.findOne(ids);
        if(userEntity != null) userRepository.delete(ids);

    }

/*
    @Override
    public int getTotalItems(String searchValue) {
        int totalItem = 0;
        int totalItemDelete = (int) userRepository.countByStatus(0);
        if (searchValue != null) {
            totalItem = (int) userRepository.countByUserNameOrFullNameOrPhoneOrEmailContainingIgnoreCase(searchValue, searchValue, searchValue, searchValue) - totalItemDelete;
        } else {
            totalItem = (int) userRepository.count() - totalItemDelete;
        }
        if (totalItem < 0) {
            return 0;
        }
        return totalItem;
    }*/

}
