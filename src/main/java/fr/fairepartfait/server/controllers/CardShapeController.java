package fr.fairepartfait.server.controllers;

import fr.fairepartfait.server.models.CardShape;
import fr.fairepartfait.server.repositories.CardShapeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class CardShapeController {

    @Autowired
    private CardShapeRepository cardShapeRepository;

    @GetMapping("/cardshapes")
    public @ResponseBody Iterable<CardShape> getCardShapes() {
        return cardShapeRepository.findAll();
    }

    @GetMapping("/cardshapes/{id}")
    public @ResponseBody CardShape getCardShapeById(@PathVariable int id) {
        return cardShapeRepository.existsById(id) ? cardShapeRepository.findById(id).get() : null;
    }


}
