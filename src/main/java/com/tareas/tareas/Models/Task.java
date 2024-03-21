package com.tareas.tareas.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String description;
    private LocalDate startDate;

    public Task(Long id, String name, String description, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
    }

    @ManyToOne(optional = false) // Especifica que la relación es obligatoria
    @JoinColumn(name = "user_id") // Nombre de la columna de la clave foránea en la tabla Task
    private User user;

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
