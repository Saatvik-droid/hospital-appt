package com.example.hospitalappt.utils;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

public enum GenderEnum {
    MALE("M"), FEMALE("F"), OTHER("O");

    private final String code;

    GenderEnum(String code) {
        this.code = code;
    }

    @JsonCreator
    public static GenderEnum decode(String code) {
        return Stream.of(GenderEnum.values()).filter(targetEnum -> targetEnum.code.equals(code)).findFirst().orElse(null);
    }

    @JsonValue
    public String getCode() {
        return code;
    }
}
