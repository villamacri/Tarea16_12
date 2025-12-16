package com.salesianostriana.dam.tarea16_12.repository;

import com.salesianostriana.dam.tarea16_12.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
