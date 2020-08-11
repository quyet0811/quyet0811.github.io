package com.createuser.controller;

import com.createuser.dto.UserDTO;
import com.createuser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/web/api/user")
public class UserApi {
    @Autowired
    private IUserService userService;

    @PutMapping
    @ResponseBody
    public ResponseEntity<?> updateUser(@RequestBody UserDTO userDTO) {
        userService.update(userDTO);
        return new ResponseEntity("success", HttpStatus.OK);

    }
}
