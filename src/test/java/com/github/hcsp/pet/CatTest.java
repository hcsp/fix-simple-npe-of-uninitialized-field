package com.github.hcsp.pet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    public void catNameLengthTest() {
        assertEquals(0, new Cat().getNameLength());
    }
}
