package org.solutions.string;

public class ChessSquareColor {

    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1"));
        System.out.println(squareIsWhite("h3"));
        System.out.println(squareIsWhite("e5"));
        System.out.println(squareIsWhite("g8"));
    }

    public static boolean squareIsWhite(String coordinates) {
        int i = (coordinates.charAt(0) - 97) % 2;
        int j = coordinates.charAt(1) % 2;
        return i == j;
    }
}
