package com.tictactoe;

public class TicTacToe {
    private boolean won;
    private final Point[] points = new Point[9];

   public TicTacToe() {
       int i;
       Point pointInit = new Point();
       for(i = 0; i < 9; i++)
           points[i] = pointInit;
    }

    public void setWon(boolean wstate) {
        this.won = wstate;
    }

    public boolean getWon() {
        return this.won;
    }

    public void setPointsElement(Point point) {
        points[3 * point.getY() + point.getX()] = point;
    }

    public boolean checkWon() {

        return (points[0].getLetter() == 'X' && points[4].getLetter() == 'X' && points[8].getLetter() == 'X')
                || (points[0].getLetter() == 'O' && points[4].getLetter() == 'O' && points[8].getLetter() == 'O')
                || (points[2].getLetter() == 'X' && points[4].getLetter() == 'X' && points[6].getLetter() == 'X')
                || (points[2].getLetter() == 'O' && points[4].getLetter() == 'O' && points[6].getLetter() == 'O')
                || (points[0].getLetter() == 'X' && points[1].getLetter() == 'X' && points[2].getLetter() == 'X')
                || (points[0].getLetter() == 'O' && points[1].getLetter() == 'O' && points[2].getLetter() == 'O')
                || (points[3].getLetter() == 'X' && points[4].getLetter() == 'X' && points[5].getLetter() == 'X')
                || (points[3].getLetter() == 'O' && points[4].getLetter() == 'O' && points[5].getLetter() == 'O')
                || (points[6].getLetter() == 'X' && points[7].getLetter() == 'X' && points[8].getLetter() == 'X')
                || (points[6].getLetter() == 'O' && points[7].getLetter() == 'O' && points[8].getLetter() == 'O')
                || (points[0].getLetter() == 'X' && points[3].getLetter() == 'X' && points[6].getLetter() == 'X')
                || (points[0].getLetter() == 'O' && points[3].getLetter() == 'O' && points[6].getLetter() == 'O')
                || (points[1].getLetter() == 'X' && points[4].getLetter() == 'X' && points[7].getLetter() == 'X')
                || (points[1].getLetter() == 'O' && points[4].getLetter() == 'O' && points[7].getLetter() == 'O')
                || (points[2].getLetter() == 'X' && points[5].getLetter() == 'X' && points[8].getLetter() == 'X')
                || (points[2].getLetter() == 'O' && points[5].getLetter() == 'O' && points[8].getLetter() == 'O');
    }

    public  boolean checkPoint(Point point) {
        if ( (point.getX() == 0 || point.getX() == 1 || point.getX() == 2) && ( point.getY() == 0 || point.getY() == 1 || point.getY() == 2 ) && (point.getLetter() ==  'X' || point.getLetter() == 'O') && ( points[3 * point.getY() + point.getX()].getLetter() == '-') ) {
            return true;
        }
        else {
            System.out.println("Dothikan lathos dedomena!");
            return false;
        }
    }

    public void print() {
        System.out.println("TRILIZA");
        System.out.println("----------------------------------------");
        System.out.println("\n");
        System.out.println("\t" + "  " + points[0].getLetter() + "  " + "|"+ "  " + points[1].getLetter() + "  "+ "|" + "  "+ points[2].getLetter() + "  ");
        System.out.println("\t" + "-----" + "+" + "-----" + "+" + "-----");
        System.out.println("\t" + "  " + points[3].getLetter() + "  " + "|"+ "  " + points[4].getLetter() + "  "+ "|" + "  "+ points[5].getLetter() + "  ");
        System.out.println("\t" + "-----" + "+" + "-----" + "+" + "-----");
        System.out.println("\t" + "  " + points[6].getLetter() + "  " + "|"+ "  " + points[7].getLetter() + "  "+ "|" + "  "+ points[8].getLetter() + "  ");
    }

}
