package com.github.opheliah95.model;

import java.util.UUID;

public class Student {
    private final UUID id;
    private final String name;

    public Student(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

