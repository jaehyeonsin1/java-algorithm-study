package day24;

import java.util.ArrayDeque;
import java.util.Queue;

public class NumberOfIslands {

    private static final int[] DR = {-1, 1, 0, 0};
    private static final int[] DC = {0, 0, -1, 1};

    /*
    [DFS/BFS] 섬의 개수

    1은 땅, 0은 물을 의미하는 2차원 배열 grid가 주어집니다.
    상하좌우로 연결된 땅은 하나의 섬으로 봅니다.

    grid에 존재하는 섬의 개수를 반환하세요.


    예시 1

    입력:
    grid = [
        [1, 1, 0, 0, 0],
        [1, 1, 0, 0, 0],
        [0, 0, 1, 0, 0],
        [0, 0, 0, 1, 1]
    ]

    출력:
    3

    설명:
    왼쪽 위, 가운데, 오른쪽 아래에 각각 하나의 섬이 있습니다.


    예시 2

    입력:
    grid = [
        [1, 1, 1],
        [0, 1, 0],
        [1, 1, 1]
    ]

    출력:
    1


    예시 3

    입력:
    grid = [
        [0, 0],
        [0, 0]
    ]

    출력:
    0


    제한 사항

    1 <= grid.length <= 300
    1 <= grid[i].length <= 300
    grid[i][j]는 0 또는 1입니다.
    입력 배열을 직접 변경해도 됩니다.
    대각선으로 맞닿은 땅은 연결된 것으로 보지 않습니다.
    */

    public static void main(String[] args) {

        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };

        int result = solution(grid);

        System.out.println(result); // 3
    }

    public static int solution(int[][] grid) {

        int rows = grid.length;
        int columns = grid[0].length;
        int islandCount = 0;

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (grid[row][column] == 0) {
                    continue;
                }

                islandCount++;
                sinkIsland(grid, row, column);
            }
        }

        return islandCount;
    }

    private static void sinkIsland(int[][] grid, int startRow, int startColumn) {

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{startRow, startColumn});
        grid[startRow][startColumn] = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            for (int direction = 0; direction < 4; direction++) {
                int nextRow = current[0] + DR[direction];
                int nextColumn = current[1] + DC[direction];

                if (nextRow < 0 || nextRow >= grid.length
                        || nextColumn < 0 || nextColumn >= grid[0].length
                        || grid[nextRow][nextColumn] == 0) {
                    continue;
                }

                grid[nextRow][nextColumn] = 0;
                queue.offer(new int[]{nextRow, nextColumn});
            }
        }
    }
}
