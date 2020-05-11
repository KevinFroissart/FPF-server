package fr.fairepartfait.server.controllers;

import fr.fairepartfait.server.models.User;
import fr.fairepartfait.server.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/users")
    public @ResponseBody Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/api/users/{id}")
    public @ResponseBody User getUserById(@PathVariable int id) {
        return userRepository.findById(id).get();
    }

    @PutMapping("/api/users/create")
    public @ResponseBody User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }


}
