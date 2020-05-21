package fr.fairepartfait.server.controllers;


import fr.fairepartfait.server.models.Card;
import fr.fairepartfait.server.utils.ImageManager;
import fr.fairepartfait.server.utils.ImagePreview;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;

@CrossOrigin(origins = "*")
@RestController
public class ImagePreviewController {

    private ImageManager manager;

    public ImagePreviewController() { this.manager = new ImageManager(); }

    @PostMapping("/api/imagepreview/create")
    public @ResponseBody String createImage(@RequestBody Card card) {
        manager.addCard(card);
        return card.getId();
    }

    @GetMapping("/api/imagepreview/{id}")
    public @ResponseBody byte[] getImagePreview(@PathVariable String id) throws IOException {
        Card card = manager.getCardById(id);
        InputStream in = ImagePreview.generateCardPreview(card);
        return IOUtils.toByteArray(in);
    }

}
