package com.salesianostriana.E02.repos;

import com.salesianostriana.E02.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductoRepository extends JpaRepository<Producto, UUID> {
}
