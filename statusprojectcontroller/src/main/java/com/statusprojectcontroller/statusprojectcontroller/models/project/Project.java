package com.statusprojectcontroller.statusprojectcontroller.models.project;


import jakarta.persistence.*;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String name;
    private String[] type;
    private String domain;
    private String ambientTest;
    private String color;

    public Project(int id, String name, String type, String domain, String ambientTest, String color) {
        this.id = id;
        this.name = name;
        this.type = new String[]{
                "One Page", "Store"
        };
        this.domain = domain;
        this.ambientTest = ambientTest;
        this.color = color;
    }
}
