package com.db.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@Getter(AccessLevel.PUBLIC)
public class FindUserResponse implements Serializable {
    @JsonProperty("user_id")
    private Integer userId;
    private String name;
    private String username;
}