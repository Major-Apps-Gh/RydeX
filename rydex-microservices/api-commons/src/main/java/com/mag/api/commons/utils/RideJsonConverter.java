package com.mag.api.commons.utils;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mag.api.commons.model.Ride;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class RideJsonConverter implements AttributeConverter<Ride, String> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Ride jsonData) {
        try {
            return objectMapper.writeValueAsString(jsonData);
        } catch (JsonProcessingException e) {
            // Handle exception or log error
            return null;
        }
    }

    @Override
    public Ride convertToEntityAttribute(String json) {
        try {
            return objectMapper.readValue(json, Ride.class);
        } catch (JsonProcessingException e) {
            // Handle exception or log error
            return null;
        }
    }
}
