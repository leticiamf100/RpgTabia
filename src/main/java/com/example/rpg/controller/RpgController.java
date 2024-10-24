package com.example.rpg.controller;

import com.example.rpg.loot.Loot;
import com.example.rpg.loot.LootRepository;
import com.example.rpg.loot.LootResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("loot")
public class RpgController {

    @Autowired
    private LootRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<LootResponseDTO> getAll(){

        List<LootResponseDTO> lootList = repository.findAll().stream().map(LootResponseDTO::new).toList();
        return lootList;
    }
}
