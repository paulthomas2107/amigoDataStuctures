package com.amigoscode;

import lombok.extern.java.Log;

import java.util.Arrays;

@Log
public class Arrays2D {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        for (int i=0; i < 3; i++) {
            for (int j=0; j < 3; j++) {
                board[i][j] = '-';
            }
        }


        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';

        log.info(Arrays.deepToString(board));

        char[][] board2 = new char[][] {
                new char[] {'-', '-', '-'},
                new char[] {'-', '-', '-'},
                new char[] {'-', '-', '-'}
        };
        log.info(Arrays.deepToString(board2));

    }
}
