package ru.mirea.leontyevme.task1;

public class Dog extends Animal{
    private String breed;
    public Dog(String breed) {
        this.breed = breed;
    }
    @Override
    public void sleep() {}
    @Override
    public void wake() {}
    @Override
    public void voice() {}
}
