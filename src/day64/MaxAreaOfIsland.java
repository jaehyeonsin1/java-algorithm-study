package day64;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxAreaOfIsland {

    /*
    [그래프/DFS·BFS] 가장 큰 섬의 넓이

    0(물)과 1(땅)로 이루어진 m x n 크기의 격자 grid가 주어집니다.

    섬은 상하좌우로 인접한 땅이 연결되어 만들어지며,
    섬의 넓이는 해당 섬을 이루는 칸의 개수입니다.

    grid에서 가장 큰 섬의 넓이를 반환하세요.
    섬이 하나도 없다면 0을 반환합니다.


    예시 1

    입력:
    grid = [[0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0],
            [0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0],
            [0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0],
            [0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0],
            [0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0],
            [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0],
            [0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0],
            [0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0]]

    출력:
    6

    설명:
    대각선으로 맞닿은 칸은 연결된 것으로 보지 않습니다.


    예시 2

    입력:
    grid = [[0, 0, 0, 0, 0, 0, 0, 0]]

    출력:
    0


    제한 사항

    1 <= grid.length, grid[i].length <= 50
    grid[i][j]는 0 또는 1입니다.
    */

    public static void main(String[] args) {

        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };

        int result = solution(grid);

        System.out.println(result); // 6
    }

    public static int solution(int[][] grid) {

        int rows = grid.length;
        int columns = grid[0].length;
        int maxArea = 0;

        int[] rowDirections = {-1, 1, 0, 0};
        int[] columnDirections = {0, 0, -1, 1};

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (grid[row][column] == 0) {
                    continue;
                }

                int area = 0;
                Deque<Integer> stack = new ArrayDeque<>();

                stack.push(row * columns + column);
                grid[row][column] = 0;

                while (!stack.isEmpty()) {
                    int position = stack.pop();
                    int currentRow = position / columns;
                    int currentColumn = position % columns;

                    area++;

                    for (int direction = 0; direction < 4; direction++) {
                        int nextRow = currentRow + rowDirections[direction];
                        int nextColumn = currentColumn + columnDirections[direction];

                        if (nextRow < 0 || nextRow >= rows
                                || nextColumn < 0 || nextColumn >= columns
                                || grid[nextRow][nextColumn] == 0) {
                            continue;
                        }

                        grid[nextRow][nextColumn] = 0;
                        stack.push(nextRow * columns + nextColumn);
                    }
                }

                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}
