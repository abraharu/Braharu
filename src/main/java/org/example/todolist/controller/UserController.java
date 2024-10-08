package org.example.todolist.controller;

import lombok.RequiredArgsConstructor;
import org.example.todolist.dto.RegistrationRequest;
import org.example.todolist.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegistrationRequest registrationRequest) { // заменить на dto
        userService.register(registrationRequest);
        return ResponseEntity.ok("User registered");
    }
}