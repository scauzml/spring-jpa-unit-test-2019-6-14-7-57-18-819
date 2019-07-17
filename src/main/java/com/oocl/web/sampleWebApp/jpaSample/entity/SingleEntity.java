package com.oocl.web.sampleWebApp.jpaSample.entity;

import javax.persistence.*;

@Entity
@Table
public class SingleEntity {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;

    public SingleEntity() {
    }

    public SingleEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
