package org.poojitha;
abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract String getSound();
    public String getName() {
        return name;
    }
}
