package com.company.homework_lesson_22.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Builder
@Table(name = "managers")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"flat"})
public class Manager {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Info info;

    @OneToMany(mappedBy = "manager")
    private List<Flat> flats;

    @Override
    public String toString() {
        return " Id: " + id + "\n" + info;
    }
}
