package com.createuser.service.impl;

import com.createuser.dto.RoleDTO;
import com.createuser.entity.RoleEntity;
import com.createuser.repository.RoleRepository;
import com.createuser.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleService implements IRoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Map<String, String> getRoles() {
        Map<String, String> roles = new HashMap<>();
        List<RoleEntity> entities = roleRepository.findAll();
        entities.forEach(item -> {
            roles.put(Long.toString(item.getId()), item.getUserName());
        });
        return roles;
    }

    @Override
    public List<RoleDTO> getAllRoles() {
        List<RoleDTO> roleDTOs = new ArrayList<RoleDTO>();
        List<RoleEntity> roleEntities = roleRepository.findAll();
        for(RoleEntity item: roleEntities){
            RoleDTO roleDTO = new RoleDTO();
            roleDTO.setName(item.getUserName());
            //roleDTO.setCode(item.getCode());
            roleDTO.setId(item.getId());
            roleDTOs.add(roleDTO);
        }
        return roleDTOs;
    }
}
