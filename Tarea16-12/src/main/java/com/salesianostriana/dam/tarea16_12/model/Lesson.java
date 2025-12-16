package com.salesianostriana.dam.tarea16_12.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Lesson {
    @Id
    @GeneratedValue
    private Long id;

    private String nombreLeccion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_course_lesson"))
    private Course course;
}
