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
@Table(name = "product")
public class Producto implements Serializable {

    @Id
    private UUID id;

    @Column(name = "name",length = 255,nullable = false)
    private String nombre;

    @Column(name = "image")
    private String imagen;

    @Column(name = "description")
    private String descripcion;

    @Column(name = "price",nullable = false)
    private double precio;

    public Producto(){
        id = UUID.randomUUID();
    }
}
