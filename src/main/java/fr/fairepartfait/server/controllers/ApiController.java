package fr.fairepartfait.server.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class ApiController {

    @GetMapping("/api/v1/myresource")
    public @ResponseBody String hello() {
        return "hello, world";
    }

}