package com.geniusee.task.cinema.util;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Validator {

    public  <T> boolean isDtoInvalid(T dto) {
        return null == dto;
    }

    public boolean isIdInvalid(UUID id){
        return null == id;
    }
}
