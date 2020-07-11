package es.rafa.cmstraining.controller;

import es.rafa.cmstraining.service.userService.UserService;
import es.rafa.cmstraining.service.userService.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String home() {
        return userService.getAllUsers().get(0).getName();
    }
}
