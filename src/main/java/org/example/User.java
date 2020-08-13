package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("_id")
    private String id;
    @JsonProperty("name")
    private Name name;
}