package com.example.rpg.event;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "event")
@Entity(name = "event")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Event {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer valor;
    private String evento;
    private String image;
}