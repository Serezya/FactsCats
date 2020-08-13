package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fact {

    @JsonProperty("_id")
    private String id;

    @JsonProperty("text")
    private String text;

    @JsonProperty("type")
    private String type;

    @JsonProperty("user")
    private User user;

    @JsonProperty("upvotes")
    private int upvotes;

    @JsonProperty("userUpvoted")
    private Object userUpvoted;

    public String getText() {
        return text;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Fact{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user=" + user +
                ", upvotes=" + upvotes +
                ", userUpvoted=" + userUpvoted +
                '}';
    }
}