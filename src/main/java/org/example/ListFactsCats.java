package org.example;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListFactsCats {
    @JsonProperty("all")
    private List<Fact> cats;

    public List<Fact> getAllCats() {
        return cats;
    }

    @Override
    public String toString() {
        return "ListFactsCats{" +
                "cats=" + cats +
                '}';
    }
}