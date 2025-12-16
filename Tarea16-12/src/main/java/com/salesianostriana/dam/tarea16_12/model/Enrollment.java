package com.salesianostriana.dam.tarea16_12.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Enrollment {
    @EmbeddedId
    private EnrollmentId enrollmentPK = new EnrollmentId();

    public Enrollment(User u, Course c){
        this.user = u;
        this.course = c;
    }

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    private Course course;

    private LocalDate enrolledAt;
    private TipoStatus status;
}
