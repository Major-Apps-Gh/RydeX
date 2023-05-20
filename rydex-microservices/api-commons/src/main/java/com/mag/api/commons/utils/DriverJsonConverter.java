package com.mag.api.commons.utils;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mag.api.commons.model.Driver;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class DriverJsonConverter implements AttributeConverter<Driver, String> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Driver jsonData) {
        try {
            return objectMapper.writeValueAsString(jsonData);
        } catch (JsonProcessingException e) {
            // Handle exception or log error
            return null;
        }
    }

    @Override
    public Driver convertToEntityAttribute(String json) {
        try {
            return objectMapper.readValue(json, Driver.class);
        } catch (JsonProcessingException e) {
            // Handle exception or log error
            return null;
        }
    }
}
