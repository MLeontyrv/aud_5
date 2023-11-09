package ru.mirea.leontyevme.task3;

public class Position {
    private int x;
    private int y;
    public Position(int x, int y){
        this.x = x;
        this.y =y;
    }
    public int X() {
        return x;
    }
    public int Y() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
