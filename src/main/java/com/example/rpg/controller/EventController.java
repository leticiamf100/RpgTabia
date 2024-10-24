package com.example.rpg.controller;

import com.example.rpg.event.Event;
import com.example.rpg.event.EventRepository;
import com.example.rpg.event.EventResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("event")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<EventResponseDTO> getAllEvents() {

        List<EventResponseDTO> eventList = eventRepository.findAll().stream().map(EventResponseDTO::new).toList();
        return eventList;
    }
}
