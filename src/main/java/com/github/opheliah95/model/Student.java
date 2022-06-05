package com.github.opheliah95.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Student {
    private final UUID id;
    private final String name;

    // taking post request
    public Student(@JsonProperty("id") UUID id,
                   @JsonProperty("name") String name)
    {
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

