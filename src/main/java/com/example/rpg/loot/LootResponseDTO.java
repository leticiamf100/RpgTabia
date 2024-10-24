package com.example.rpg.loot;

public record LootResponseDTO(Long id, Integer valor, String recompensa, String image) {
    public LootResponseDTO(Loot loot){
        this(loot.getId(), loot.getValor(), loot.getRecompensa(), loot.getImage());
    }
}
