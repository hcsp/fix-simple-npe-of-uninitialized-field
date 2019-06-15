package com.github.hcsp.pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    public void catNameLengthTest() {
        Assertions.assertEquals(0, new Cat().getNameLength());
    }
}
