package com.geniusee.task.cinema.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
public class ValidatorTest {

    private final Validator validator = new Validator();

    @Test
    public void testIsDtoInvalid(){
        assertFalse(validator.isDtoInvalid(new Object()));
    }

    @Test
    public void testIsDtoInvalidDtoNull(){
        assertTrue(validator.isDtoInvalid(null));
    }

    @Test
    public void testIsIdInvalid(){
        assertFalse(validator.isIdInvalid(new UUID(1L, 10L)));
    }

    @Test
    public void testIsIdInvalidIdNull(){
        assertTrue(validator.isIdInvalid(null));
    }
}
