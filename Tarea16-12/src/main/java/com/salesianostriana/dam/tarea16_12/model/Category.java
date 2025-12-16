package com.salesianostriana.dam.tarea16_12.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    private String nombreCategoria;

    @ManyToMany
    @JoinTable(
            name = "category_course",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> courses=new HashSet<>();


}
