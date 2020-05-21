package fr.fairepartfait.server.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Arrays;

@CrossOrigin(origins = "*")
@RestController
public class FontController {

    @GetMapping("/api/fonts")
    public @ResponseBody Iterable<String> getAllFonts() throws IOException {
        return Arrays.asList("Sans Serif", "Serif");
    }

}
