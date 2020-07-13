package es.rafa.cmstraining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class Controller {
    @Autowired
    ResourceLoader resourceLoader;

    private static final String FOTO_JPG = "classpath:hommer.jpg";

    @GetMapping("/")
    public ResponseEntity<byte[]> home() throws IOException {
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(StreamUtils.copyToByteArray(resourceLoader.getResource(FOTO_JPG).getInputStream()));
    }
}

