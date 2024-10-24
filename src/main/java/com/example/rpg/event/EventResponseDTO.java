package com.example.rpg.event;

public record EventResponseDTO(Long id, Integer valor, String evento, String image) {
    public EventResponseDTO(Event event){
        this(event.getId(), event.getValor(), event.getEvento(), event.getImage());
    }
}

