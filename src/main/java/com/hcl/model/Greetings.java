package com.hcl.model;

import lombok.*;

@Data
@Builder
public class Greetings {
    private long timestamp;
    private String message;
}
