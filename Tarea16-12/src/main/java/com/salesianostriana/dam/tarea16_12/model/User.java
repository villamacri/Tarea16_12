package com.salesianostriana.dam.tarea16_12.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String nombreUser;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Enrollment> enrollmentList=new ArrayList<>();
}
