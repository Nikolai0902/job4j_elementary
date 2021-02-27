package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        rsl = Math.abs(x2 - x1) == Math.abs(y2 - y1) ? Math.abs(y2 - y1) : rsl;
        return rsl;
    }

    public static void main(String[] args) {
        int maxres = ChessBoard.way(7, 7, 1, 1);
        System.out.println(maxres);
    }
}
