package com.example.hospitalappt.dtoConverters;

import com.example.hospitalappt.dto.GenderEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Optional;


@Converter
public class GenderEnumConverter implements AttributeConverter<GenderEnum, String> {
    @Override
    public String convertToDatabaseColumn(GenderEnum genderEnum) {
        return Optional.ofNullable(genderEnum).map(GenderEnum::getCode).orElse(null);
    }

    @Override
    public GenderEnum convertToEntityAttribute(String s) {
        return GenderEnum.decode(s);
    }
}
