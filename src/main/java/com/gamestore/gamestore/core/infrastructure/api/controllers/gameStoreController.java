package com.gamestore.gamestore.core.infrastructure.api.controllers;

import com.gamestore.gamestore.core.application.gameStore.gameStoreApplication;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/gameStore")
public class gameStoreController {

    private final gameStoreApplication gameStoreAppliacition;

    @GetMapping("/get")
    public String sayGameStore() {
        return "HOLAAAAAAAAAA";
    }
}