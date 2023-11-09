package ru.mirea.leontyevme.theme2.task1;

public class Cat extends Animal {
    private String color;
    private String breed;
    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }
    @Override
    public void voice() {}
    @Override
    public void sleep() {}
    @Override
    public void wake() {}
}
