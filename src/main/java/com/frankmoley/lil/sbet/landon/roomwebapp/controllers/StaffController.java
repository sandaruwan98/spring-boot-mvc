package com.frankmoley.lil.sbet.landon.roomwebapp.controllers;

import com.frankmoley.lil.sbet.landon.roomwebapp.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @GetMapping
    public String getAllStaff(Model model){
        model.addAttribute("members", staffService.getMembers());
        return "staff";
    }
}
