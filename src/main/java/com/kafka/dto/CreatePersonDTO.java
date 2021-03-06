package com.kafka.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CreatePersonDTO implements Serializable {
    private String firstName;
    private String lastName;
}
