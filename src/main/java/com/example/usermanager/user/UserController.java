package com.example.usermanager.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{email}")
    public ResponseEntity getUser(@PathVariable("email") String email) {
        return userService.findUser(email);
    }

    @GetMapping("/users")
    public ResponseEntity getUsers() {
        return userService.findUsers();
    }

    @PostMapping("/adduser")
    public ResponseEntity addUser(@Valid @RequestBody User user) {
        return userService.saveUser(user);
    }

    @Transactional
    @PutMapping("/users/{username}")
    public ResponseEntity editUser(@PathVariable("username") String username, @Valid @RequestBody UserDto userDto) {
        return userService.updateUser(username, userDto);
    }

    @Transactional
    @DeleteMapping("/users/{username}")
    public ResponseEntity deleteUser(@PathVariable("username") String username) {
        return userService.deleteUser(username);
    }
}
