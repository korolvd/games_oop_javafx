package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkHorizontal(board, i) || checkVertical(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int i = 1; i < board[row].length; i++) {
            if (board[row][0] != board[row][i]) {
                result = false;
                break;
            }

        }
        return result;
    }

    public static boolean checkVertical(int[][] board, int column) {
        boolean result = true;
        for (int i = 1; i < board.length; i++) {
            if (board[0][column] != board[i][column]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
