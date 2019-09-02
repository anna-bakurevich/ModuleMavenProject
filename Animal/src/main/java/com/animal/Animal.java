package com.animal;

public class Animal {
    private final String species;
    private final String name;
    private final int age;


    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static String getInformationOfAnimal(Animal animal) {
        return String.format("%s %s %d", animal.getSpecies(), animal.getName(), animal.getAge());
    }
}
