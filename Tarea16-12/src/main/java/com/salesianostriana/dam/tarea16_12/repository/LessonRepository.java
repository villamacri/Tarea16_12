package com.salesianostriana.dam.tarea16_12.repository;

import com.salesianostriana.dam.tarea16_12.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
