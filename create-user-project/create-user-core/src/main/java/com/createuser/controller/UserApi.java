package com.createuser.controller;

import com.createuser.dto.UserDTO;
import com.createuser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/web/api/user")
public class UserApi {
    @Autowired
    private IUserService userService;

    @PutMapping("/{id}")
   /* public String updateUserName(UserDTO userDTO, @PathVariable("id") long id){
        userService.update(userDTO, id);
        return "ok";
    }*/
    public String updateUser(@RequestBody UserDTO userDTO, @PathVariable("id") long id) {
        userService.update(userDTO,id);
        return "ok";
    }
}
