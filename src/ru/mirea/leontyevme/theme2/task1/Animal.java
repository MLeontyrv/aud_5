package ru.mirea.leontyevme.theme2.task1;

public abstract class Animal implements Voicable {
    protected String name;
    protected int age;
    public Animal(){}
    public abstract void sleep();
    public abstract void wake();
}
