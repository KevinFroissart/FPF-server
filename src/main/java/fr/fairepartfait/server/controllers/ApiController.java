package fr.fairepartfait.server.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {

    @GetMapping("/api/v1/myresource")
    public @ResponseBody String hello() {
        return "hello, world";
    }

}