package com.createuser.service;

import com.createuser.dto.RoleDTO;

import java.util.List;
import java.util.Map;

public interface IRoleService {
    Map<String, String> getRoles();
    List<RoleDTO> getAllRoles();
}
