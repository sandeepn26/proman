package com.proman.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proman.server.service.UserService;
import com.proman.web.model.User;

@Controller
public class UserController {
	
	@Autowired
    private UserService userService;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String submit(@ModelAttribute("user")User user, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", user.getUsername());
        
        com.proman.server.model.User dbuser = new com.proman.server.model.User();
        dbuser.setUsername(user.getUsername());
        dbuser.setPassword(user.getPassword());
        dbuser.setEnabled(true);
        dbuser.setLocked(false);
        dbuser.setFailedLogins(0);
        userService.saveUser(dbuser);
        return "success";
    }
}
