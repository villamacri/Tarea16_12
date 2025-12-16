package com.salesianostriana.dam.tarea16_12.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"user_id", "course_id"})
        }
)
public class Review {
    @Id
    @GeneratedValue
    private Long id;

    private String autor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_user_review"))
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_course_review"))
    private Course course;
}
