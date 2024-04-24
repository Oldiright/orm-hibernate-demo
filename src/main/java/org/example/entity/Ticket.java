package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.ZonedDateTime;
@Entity
@Data
@Table(name = "ticket")
public class Ticket {
    @Id
    private long id;
    private long clientId;
    private ZonedDateTime createdAt;
    private String fromPlanetId;
    private String toPlanetId;



//    CREATE TABLE Ticket(
//            id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
//            created_at TIMESTAMP WITH TIME ZONE GENERATED ALWAYS AS CURRENT_TIMESTAMP(),
//    client_id BIGINT,
//    from_planet_id VARCHAR NOT NULL REFERENCES planet(id),
//    to_planet_id VARCHAR NOT NULL REFERENCES planet(id),
//    FOREIGN KEY(id) REFERENCES ticket(id),
//    FOREIGN KEY(client_id) REFERENCES Client(id),
//    CHECK from_planet_id  != to_planet_id);
}
