package net.viralpatel.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

   /* @Autowired
    EmployeeService service;*/

    @GetMapping("/home")
    public String hello(Model model) {

       /* model.addAttribute("name", "SSCP");

        Employee empNew = new Employee(8l, "web", "web", "Senior web", 2000);

        // Save new employee
        service.addNewEmployee(empNew);

        // Get saved employee
        Employee employee = service.getEmployee(empNew.getId());
*/
        return "welcome";
    }
}
