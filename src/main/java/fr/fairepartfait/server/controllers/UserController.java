package fr.fairepartfait.server.controllers;

import fr.fairepartfait.server.models.User;
import fr.fairepartfait.server.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/users")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/api/users/{id}")
    public @ResponseBody User getUserById(@PathVariable int id) {
        return userRepository.existsById(id) ? userRepository.findById(id).get() : null;
    }

    @PutMapping("/api/users/create")
    public @ResponseBody User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/api/users/{id}")
    public @ResponseBody boolean deleteUserById(@PathVariable int id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }


}
