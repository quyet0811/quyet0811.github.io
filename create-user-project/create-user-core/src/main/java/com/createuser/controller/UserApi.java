package com.createuser.controller;

import com.createuser.dto.UserDTO;
import com.createuser.entity.UserEntity;
import com.createuser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*
@Controller

public class UserApi {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/api/user1", method = RequestMethod.POST)
    @ResponseBody
    public String createUser( UserDTO userDTO){
        userService.insert(userDTO);
        return "ok";
    }
}
*/
