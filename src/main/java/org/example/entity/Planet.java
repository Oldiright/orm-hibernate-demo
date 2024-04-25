package org.example.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Data
@Table(name = "planet")

public class Planet {
    @Id
    @Pattern(regexp = "^[A-Z0-9]+$", message = "Value must match the pattern")
    private String id;
    @Column(name = "name", length = 500)
    private String name;
}
