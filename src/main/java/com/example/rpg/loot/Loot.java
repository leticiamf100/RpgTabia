package com.example.rpg.loot;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "loot")
@Entity(name = "loot")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Loot {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer valor;
    private String recompensa;
    private String image;
}
