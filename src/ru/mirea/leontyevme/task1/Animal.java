package ru.mirea.leontyevme.task1;

public abstract class Animal implements Voicable {
    protected String name;
    protected int age;
    public Animal(){}
    public abstract void sleep();
    public abstract void wake();
}
