package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.ZonedDateTime;
@Entity
@Data
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "client_id")
    private long clientId;
    @Column(name = "created_at")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ZonedDateTime createdAt;
    @Column(name = "from_planet_id")
    private String fromPlanetId;
    @Column(name = "to_planet_id")
    private String toPlanetId;
}
