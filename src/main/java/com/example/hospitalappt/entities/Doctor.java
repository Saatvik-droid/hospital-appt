package com.example.hospitalappt.entities;

import jakarta.persistence.*;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String location;

    public Doctor(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Doctor() {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", name='" + name + '\'' + ", location='" + location + '\'' + '}';
    }

}
