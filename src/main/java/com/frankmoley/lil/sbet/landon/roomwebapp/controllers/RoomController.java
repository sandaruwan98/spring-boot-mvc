package com.frankmoley.lil.sbet.landon.roomwebapp.controllers;

import java.util.ArrayList;
import java.util.List;

import com.frankmoley.lil.sbet.landon.roomwebapp.models.Room;
import com.frankmoley.lil.sbet.landon.roomwebapp.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms", roomService.getRooms());
        return "rooms";
    }
}
