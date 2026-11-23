package day66;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SurroundedRegions {

    /*
    [그래프/DFS·BFS] 둘러싸인 영역

    'X'와 'O'로 이루어진 m x n 크기의 보드 board가 주어집니다.

    상하좌우로 연결된 'O' 칸들은 하나의 영역을 이룹니다.
    'X'로 완전히 둘러싸인 영역의 모든 'O'를 'X'로 바꾸세요.

    보드의 가장자리와 연결된 'O' 영역은 'X'로 둘러싸인 영역이 아니므로
    변경하면 안 됩니다.

    결과를 반환하지 않고 주어진 board를 직접 수정하세요.


    예시 1

    입력:
    board = [["X", "X", "X", "X"],
             ["X", "O", "O", "X"],
             ["X", "X", "O", "X"],
             ["X", "O", "X", "X"]]

    출력:
    [["X", "X", "X", "X"],
     ["X", "X", "X", "X"],
     ["X", "X", "X", "X"],
     ["X", "O", "X", "X"]]

    설명:
    가운데의 'O' 영역은 'X'로 완전히 둘러싸여 있으므로 'X'로 바뀝니다.
    마지막 행의 'O'는 보드의 가장자리에 있으므로 바뀌지 않습니다.


    예시 2

    입력:
    board = [["X"]]

    출력:
    [["X"]]


    제한 사항

    1 <= board.length, board[i].length <= 200
    board[i][j]는 'X' 또는 'O'입니다.
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
        Deque<Integer> queue = new ArrayDeque<>();

        for (int row = 0; row < rows; row++) {
            addBorderCell(board, row, 0, columns, queue);
            addBorderCell(board, row, columns - 1, columns, queue);
        }

        for (int column = 0; column < columns; column++) {
            addBorderCell(board, 0, column, columns, queue);
            addBorderCell(board, rows - 1, column, columns, queue);
        }

        int[] rowDirections = {-1, 1, 0, 0};
        int[] columnDirections = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int position = queue.poll();
            int currentRow = position / columns;
            int currentColumn = position % columns;

            for (int direction = 0; direction < 4; direction++) {
                int nextRow = currentRow + rowDirections[direction];
                int nextColumn = currentColumn + columnDirections[direction];

                if (nextRow < 0 || nextRow >= rows
                        || nextColumn < 0 || nextColumn >= columns
                        || board[nextRow][nextColumn] != 'O') {
                    continue;
                }

                board[nextRow][nextColumn] = 'S';
                queue.offer(nextRow * columns + nextColumn);
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (board[row][column] == 'O') {
                    board[row][column] = 'X';
                } else if (board[row][column] == 'S') {
                    board[row][column] = 'O';
                }
            }
        }
    }

    private static void addBorderCell(char[][] board, int row, int column,
                                      int columns, Deque<Integer> queue) {

        if (board[row][column] != 'O') {
            return;
        }

        board[row][column] = 'S';
        queue.offer(row * columns + column);
    }
}
