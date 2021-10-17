package com.salesianostriana.E02.repos;

import com.salesianostriana.E02.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaisRepository extends JpaRepository<Pais, UUID> {
}
