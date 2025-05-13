package tech.buildrun.agregadordeinvestimento.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.buildrun.agregadordeinvestimento.entity.User;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto createUserDto){

        return null;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable ("userId") String userId) {
        return null;
    }
}
