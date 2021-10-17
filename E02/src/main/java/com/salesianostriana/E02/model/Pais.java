package com.salesianostriana.E02.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "country")
public class Pais implements Serializable {

    @Id
    private UUID id;

    @Column(name = "name",nullable = false, length = 128)
    private String nombre;

    public Pais() {
        id = UUID.randomUUID();
    }
}
