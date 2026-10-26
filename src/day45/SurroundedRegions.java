package day45;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class SurroundedRegions {

    /*
    [그래프/DFS·BFS] 포위된 영역

    'X'와 'O'로 이루어진 m x n 크기의 2차원 배열 board가 주어집니다.

    상하좌우로 연결된 'O' 영역 중 'X'로 완전히 둘러싸인 영역을 찾아
    해당 영역의 모든 'O'를 'X'로 변경하세요.

    board의 가장자리에 있는 'O' 또는 가장자리의 'O'와 연결된 영역은
    'X'로 완전히 둘러싸인 영역이 아니므로 변경하지 않습니다.


    예시 1

    입력:
    board = [
        ['X', 'X', 'X', 'X'],
        ['X', 'O', 'O', 'X'],
        ['X', 'X', 'O', 'X'],
        ['X', 'O', 'X', 'X']
    ]

    출력:
    [
        ['X', 'X', 'X', 'X'],
        ['X', 'X', 'X', 'X'],
        ['X', 'X', 'X', 'X'],
        ['X', 'O', 'X', 'X']
    ]

    설명:
    가운데의 'O' 영역은 'X'로 완전히 둘러싸여 있으므로 'X'로 변경됩니다.
    마지막 행의 'O'는 가장자리에 있으므로 변경되지 않습니다.


    예시 2

    입력:
    board = [['X']]

    출력:
    [['X']]


    예시 3

    입력:
    board = [
        ['O', 'O'],
        ['O', 'O']
    ]

    출력:
    [
        ['O', 'O'],
        ['O', 'O']
    ]

    설명:
    모든 'O'가 가장자리와 연결되어 있으므로 변경되지 않습니다.


    제한 사항

    1 <= board.length <= 200
    1 <= board[row].length <= 200
    board[row][column]은 'X' 또는 'O'입니다.
    입력 배열 board를 직접 변경하세요.
    */

    public static void main(String[] args) {

        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        solution(board);

        System.out.println(Arrays.deepToString(board));
        // [[X, X, X, X], [X, X, X, X], [X, X, X, X], [X, O, X, X]]
    }

    public static void solution(char[][] board) {

        int rows = board.length;
        int columns = board[0].length;
        Queue<int[]> queue = new ArrayDeque<>();

        for (int row = 0; row < rows; row++) {
            markAsSafe(board, row, 0, queue);
            markAsSafe(board, row, columns - 1, queue);
        }

        for (int column = 0; column < columns; column++) {
            markAsSafe(board, 0, column, queue);
            markAsSafe(board, rows - 1, column, queue);
        }

        int[][] directions = {
                {-1, 0},
                {1, 0},
                {0, -1},
                {0, 1}
        };

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            for (int[] direction : directions) {
                int nextRow = current[0] + direction[0];
                int nextColumn = current[1] + direction[1];

                if (nextRow >= 0 && nextRow < rows
                        && nextColumn >= 0 && nextColumn < columns
                        && board[nextRow][nextColumn] == 'O') {
                    markAsSafe(board, nextRow, nextColumn, queue);
                }
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (board[row][column] == 'O') {
                    board[row][column] = 'X';
                } else if (board[row][column] == '#') {
                    board[row][column] = 'O';
                }
            }
        }
    }

    private static void markAsSafe(
            char[][] board,
            int row,
            int column,
            Queue<int[]> queue
    ) {
        if (board[row][column] == 'O') {
            board[row][column] = '#';
            queue.offer(new int[]{row, column});
        }
    }
}
