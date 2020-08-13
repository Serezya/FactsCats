package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Name {

    @JsonProperty("first")
    private String first;
    @JsonProperty("last")
    private String last;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}