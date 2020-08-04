package com.createuser.controller;

import com.createuser.dto.UserDTO;
import com.createuser.service.IRoleService;
import com.createuser.service.IUserService;
import com.createuser.service.impl.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    private IRoleService roleService;
    @Autowired
    private IUserService userService;


    @RequestMapping(value="/adduserpage", method = RequestMethod.GET)
    public ModelAndView addUserPage(){
        ModelAndView mav = new ModelAndView("web/home");
        UserDTO userDTO = new UserDTO();
        userDTO.setRoles(roleService.getRoles());
        mav.addObject("model", userDTO);
        return mav;
    }
    @RequestMapping(value = "/admin/home",method = RequestMethod.GET)
    public ModelAndView adminHome(){
        ModelAndView modelAndView = new ModelAndView("admin/home");
        return modelAndView;
    }
/*    @RequestMapping(value = "/web/submitsuccess",method = RequestMethod.POST)
    public ModelAndView success(){
        ModelAndView modelAndView = new ModelAndView("web/success");
        return modelAndView;
    }*/

    @RequestMapping(value="/web/success", method = RequestMethod.POST)
    @ResponseBody
    public String submit(UserDTO userDTO) {
        ModelAndView modelAndView = new ModelAndView("web/success");
        userService.insert(userDTO);
        return "ok";
    }
}
