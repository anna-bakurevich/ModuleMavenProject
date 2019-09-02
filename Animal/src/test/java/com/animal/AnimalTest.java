package com.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {
    @Test
    void getInformationOfAnimalTest() {
        String informationOfAnimal = Animal.getInformationOfAnimal(new Animal("Dog", "Rex", 4));
        assertEquals("Dog Rex 4", informationOfAnimal);
    }
}
