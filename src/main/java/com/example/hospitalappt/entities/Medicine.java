package com.example.hospitalappt.entities;

import jakarta.persistence.*;

@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    public Medicine(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Medicine() {
        super();
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

    @Override
    public String toString() {
        return "Medicine{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
