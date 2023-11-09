package ru.mirea.leontyevme.theme2.task3;

public class Creature extends GameObject implements Movable{
    private int hp;

    public Creature(int id, String name, Position position, int hp) {
        super(id, name, position);
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }
    public void move(Position position){}

}
