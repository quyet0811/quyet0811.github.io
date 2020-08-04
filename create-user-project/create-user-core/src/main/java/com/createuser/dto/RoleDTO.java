package com.createuser.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class RoleDTO implements Serializable {
    private static final long serialVersionUID = -9078069884989066765L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String userName;
    private String code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
