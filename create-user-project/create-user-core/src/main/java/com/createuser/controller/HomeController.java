package com.createuser.controller;

import com.createuser.dto.UserDTO;
import com.createuser.service.IRoleService;
import com.createuser.service.IUserService;
import com.createuser.service.impl.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private IRoleService roleService;
    @Autowired
    private IUserService userService;

    @RequestMapping(value="/delete/user/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return new ResponseEntity("success", HttpStatus.OK);
    }

    @RequestMapping(value="/adduserpage", method = RequestMethod.GET)
    public ModelAndView addUserPage(){
        ModelAndView mav = new ModelAndView("web/home");
        UserDTO userDTO = new UserDTO();
        userDTO.setRoles(roleService.getRoles());
        mav.addObject("model", userDTO);
        return mav;
    }
    /*    @RequestMapping(value = "/check/userName", method = RequestMethod.GET)
        public ModelAndView checkUsername(){
            ModelAndView mav = new ModelAndView();
            List<UserDTO> userDTOList = userService.getAll();
            mav.addObject("listDTO",userDTOList);
            return mav;
        }*/
    @RequestMapping(value = "/admin/home",method = RequestMethod.GET)
    public ModelAndView adminHome(){
        ModelAndView modelAndView = new ModelAndView("admin/home");
        return modelAndView;
    }
    @RequestMapping(value = "/web/delete",method = RequestMethod.GET)
    public ModelAndView delete(){
        ModelAndView modelAndView = new ModelAndView("web/delete");
        return modelAndView;
    }
    @RequestMapping(value = "/web/update",method = RequestMethod.GET)
    public ModelAndView update(){
        ModelAndView modelAndView = new ModelAndView("web/update");
        UserDTO userDTO = new UserDTO();
        userDTO.setRoles(roleService.getRoles());
        modelAndView.addObject("model", userDTO);
        return modelAndView;
    }
    @RequestMapping(value="/web/success", method = RequestMethod.POST)
    @ResponseBody
    public String submit(UserDTO userDTO) {
        ModelAndView modelAndView = new ModelAndView("web/success");
        userService.insert(userDTO);
        return "ok";
    }
    @RequestMapping(value="/deleteuser", method = RequestMethod.DELETE)
    @ResponseBody
    public ModelAndView deleteById(UserDTO userDTO) {
        ModelAndView modelAndView = new ModelAndView("web/done");
        /*userService.deleteUser(userDTO.getId());*/
        userService.deleteUser(userDTO.getId());
        return modelAndView;
    }
}
