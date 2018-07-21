package com.proman.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProfileController {

    @RequestMapping(value = { "/editpersonalinfo"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "editpersonalinfo";
    }
    
    @RequestMapping(value = { "/viewpersonalinfo"}, method = RequestMethod.GET)
    public String signUp(ModelMap model) {
        return "viewpersonalinfo";
    }
}
