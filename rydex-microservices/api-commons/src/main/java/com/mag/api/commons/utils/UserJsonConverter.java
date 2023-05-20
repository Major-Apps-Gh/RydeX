package com.mag.api.commons.utils;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mag.api.commons.model.User;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class UserJsonConverter implements AttributeConverter<User, String> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(User jsonData) {
        try {
            return objectMapper.writeValueAsString(jsonData);
        } catch (JsonProcessingException e) {
            // Handle exception or log error
            return null;
        }
    }

    @Override
    public User convertToEntityAttribute(String json) {
        try {
            return objectMapper.readValue(json, User.class);
        } catch (JsonProcessingException e) {
            // Handle exception or log error
            return null;
        }
    }
}
