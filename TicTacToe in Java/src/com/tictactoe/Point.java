package com.tictactoe;
import java.lang.*;

public class Point {
    private int x, y;
    private char letter;

    public Point() {
        setX(-1);
        setY(-1);
        setLetter('-');
    }

    public void setX(int xValue) {
        this.x = xValue;
    }

    public void setY(int yValue) {
        this.y = yValue;
    }

    public void setLetter(char letterValue) {
        this.letter = Character.toUpperCase(letterValue);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public char getLetter() {
        return this.letter;
    }

    public void print() {
        System.out.println("(" + getX() + ", " + getY() + ")" + " Value: " + getLetter());
    }
}
