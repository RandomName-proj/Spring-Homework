package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;


public class RequestData {
    @NotNull
    public String name;
}
