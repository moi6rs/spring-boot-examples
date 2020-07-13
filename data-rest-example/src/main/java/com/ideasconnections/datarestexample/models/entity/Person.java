package com.ideasconnections.datarestexample.models.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Getter
    @Setter
    @Column
    private String name;

    @Getter
    @Setter
    @Column
    private String lastName;
}
