package com.salesianostriana.dam.tarea16_12.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@NoArgsConstructor
@Data
public class EnrollmentId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;
    private Long courseId;

}
