package com.example.usermanager.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    public ResponseEntity saveUser(User user) {
        try {
            String encodedPassword = encoder.encode(user.getPassword());
            user.setPassword(encodedPassword);

            if (userRepository.existsByUsername(user.getUsername())) {

                return ResponseEntity.badRequest().body("Username is already Taken!");
            }

            if (userRepository.existsByEmail(user.getEmail())) {

                return ResponseEntity.badRequest().body("Email is already Taken!");
            }

            userRepository.save(user);

            return ResponseEntity.ok(user.getFirstname() + " Registered Successfully");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e);
        }
    }

    public ResponseEntity findUsers() {
        try {
            List<User> users = userRepository.findAll();
            if (users.isEmpty()) {
                return ResponseEntity.badRequest().body("No Records Found!");
            }
            return ResponseEntity.ok(users);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e);
        }
    }

    public ResponseEntity findUser(String email) {
        try {
            Optional<User> user=userRepository.findByEmail(email);
            if (!user.isPresent()) {
                return ResponseEntity.badRequest().body("No Record Found!");
            }
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e);
        }
    }

    public ResponseEntity deleteUser(String username) {
        try {
            userRepository.deleteByUsername(username);
            return ResponseEntity.ok(username + " deleted Successfully.");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e);
        }
    }

    public ResponseEntity updateUser(String username, UserDto userDto) {
        try {
            Optional<User> user = userRepository.findByUsername(username);

            if (user.isPresent()) {
                user.get().setFirstname(userDto.getFirstname());
                user.get().setLastname(userDto.getLastname());
                user.get().setAddress(userDto.getAddress());

                return ResponseEntity.ok(username + " related user details updated successfully.");
            } else {
                return ResponseEntity.ok("User not found!");
            }
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error: " + e);
        }
    }
}
