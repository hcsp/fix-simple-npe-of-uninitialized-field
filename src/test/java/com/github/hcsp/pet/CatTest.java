package com.github.hcsp.pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    public void catNameLengthTest() {
        Cat cat = new Cat();
        Assertions.assertEquals(-1, cat.getNameLength());
        cat.name = "A";
        Assertions.assertEquals(1, cat.getNameLength());
        cat.name = "AB";
        Assertions.assertEquals(2, cat.getNameLength());
    }
}
