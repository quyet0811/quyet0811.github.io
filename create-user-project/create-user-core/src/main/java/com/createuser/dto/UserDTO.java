package com.createuser.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = -1168917729740319618L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String email;
    private String phone;
    private String role_id;
    private List<RoleDTO> rolesList;
    private Map<String, String> roles;

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public Map<String, String> getRoles() {
        return roles;
    }

    public void setRoles(Map<String, String> roles) {
        this.roles = roles;
    }

    public List<RoleDTO> getRolesList() {
        return rolesList;
    }

    public void setRolesList(List<RoleDTO> rolesList) {
        this.rolesList = rolesList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
