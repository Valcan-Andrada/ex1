package com.example.ex1.entity;

import jakarta.persistence.*;


@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String street;
    public Address(){}

    public Address( String street, Teacher teacher) {

        this.street = street;
        this.teacher = teacher;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    //@OneToOne(mappedBy = "address")
    @OneToOne
    @JoinColumn(name = "user_id")
    private Teacher teacher;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
