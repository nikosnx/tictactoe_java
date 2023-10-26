package com.tictactoe;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static char[] stringToArray(String eisodos) {
        char[] ch = new char[eisodos.length()];
        IntStream.range(0, eisodos.length()).forEach(i -> ch[i] = eisodos.charAt(i));
        return ch;
    } //take string contents and pass them to a char[]
    public static void main(String[] args) {
        try {
            int i = 0;
            boolean b = true;
            String win = "KERDISE O PAIXTIS ";
            String winwin = "ISOPALIA\n";
            String wrongData = "Lathos dedomena eisodou, prospathiste ksana!\n";
            char sym;
            char[] temp;
            Scanner input = new Scanner(System.in);
            input.useDelimiter("\n");
            TicTacToe tictactoe = new TicTacToe();

            do {
                tictactoe.print();
                int v = b? 0 : 1;
                System.out.println("\n\nPAIKTI " + (v + 1) + ", me ti symvolo paizeis? Apanta me 'O, 'o', 'X', 'x': ");
                sym = input.next().charAt(0);
                System.out.println("\nPAIKTI " + (v + 1) + ", to symvolo sou einai " + sym + ".\n");
                System.out.println("Se poia thesi thes na paikseis me to symvolo " + sym + "? Apanta me ton arithmo stilis, arithmo grammis, apo 0 mexri 2, XWRIS KOMMA (px 0 0):");
                String tmp = input.next();
                temp = stringToArray(tmp);
                while ((temp[1] != ' ') || (temp.length !=3)) {
                    System.out.println(wrongData);
                    tmp = input.next();
                    temp = stringToArray(tmp);
                }

                Point insertedPoint = new Point();
                insertedPoint.setX(Character.getNumericValue(temp[0]));
                insertedPoint.setY(Character.getNumericValue(temp[2]));
                insertedPoint.setLetter(sym);

                while (!(tictactoe.checkPoint(insertedPoint))) {
                    tictactoe.print();
                    v = b? 0 : 1;
                    System.out.println("\n\nPAIKTI " + (v + 1) + ", me ti symvolo paizeis? Apanta me 'O, 'o', 'X', 'x': ");
                    sym = input.next().charAt(0);
                    System.out.println("\nPAIKTI " + (v + 1) + ", to symvolo sou einai " + sym + ".\n");
                    System.out.println("Se poia thesi thes na paikseis me to symvolo " + sym + "? Apanta me ton arithmo stilis, arithmo grammis, apo 0 mexri 2, XWRIS KOMMA (px 0 0):");
                    tmp = input.next();
                    temp = stringToArray(tmp);
                    while ((temp[1] != ' ') || (temp.length !=3)) {
                        System.out.println(wrongData);
                        tmp = input.next();
                        temp = stringToArray(tmp);
                    }

                    insertedPoint.setX(Character.getNumericValue(temp[0]));
                    insertedPoint.setY(Character.getNumericValue(temp[2]));
                    insertedPoint.setLetter(sym);
                }

                tictactoe.setPointsElement(insertedPoint);
                tictactoe.print();
                tictactoe.checkWon();
                i++;

                if (tictactoe.checkWon()) {
                    tictactoe.setWon(true);
                    System.out.println(win + (v + 1));
                }

                if ((i == 9) && !(tictactoe.getWon())) {
                    System.out.println(winwin);
                    break;
                }

                b = !b;

            } while (!(tictactoe.getWon()));

            System.out.println("Press return or any key + return to exit");
            int xi = System.in.read();
        }
        catch (IOException e) {
            System.out.println("No key entered!");
        }
    }
}
