package day25;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class ShortestPathInMaze {

    private static final int[] DR = {-1, 1, 0, 0};
    private static final int[] DC = {0, 0, -1, 1};

    /*
    [BFS] 미로 최단 거리

    1은 이동할 수 있는 길, 0은 벽을 의미하는 2차원 배열 maze가 주어집니다.
    왼쪽 위 칸 (0, 0)에서 오른쪽 아래 칸까지 이동할 때 필요한
    최소 이동 횟수를 반환하세요.

    한 번에 상하좌우로 인접한 한 칸만 이동할 수 있습니다.
    목적지에 도달할 수 없다면 -1을 반환하세요.


    예시 1

    입력:
    maze = [
        [1, 1, 0, 1, 1],
        [0, 1, 0, 1, 0],
        [0, 1, 1, 1, 0],
        [0, 0, 0, 1, 1]
    ]

    출력:
    7


    예시 2

    입력:
    maze = [
        [1, 0],
        [0, 1]
    ]

    출력:
    -1

    설명:
    대각선으로는 이동할 수 없으므로 목적지에 도달할 수 없습니다.


    예시 3

    입력:
    maze = [[1]]

    출력:
    0


    제한 사항

    1 <= maze.length <= 300
    1 <= maze[i].length <= 300
    maze[i][j]는 0 또는 1입니다.
    시작 칸과 도착 칸이 벽일 수도 있습니다.
    */

    public static void main(String[] args) {

        int[][] maze = {
                {1, 1, 0, 1, 1},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 1, 1}
        };

        int result = solution(maze);

        System.out.println(result); // 7
    }

    public static int solution(int[][] maze) {

        int rows = maze.length;
        int columns = maze[0].length;

        if (maze[0][0] == 0 || maze[rows - 1][columns - 1] == 0) {
            return -1;
        }

        int[][] distance = new int[rows][columns];
        for (int[] row : distance) {
            Arrays.fill(row, -1);
        }

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});
        distance[0][0] = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int column = current[1];

            if (row == rows - 1 && column == columns - 1) {
                return distance[row][column];
            }

            for (int direction = 0; direction < 4; direction++) {
                int nextRow = row + DR[direction];
                int nextColumn = column + DC[direction];

                if (nextRow < 0 || nextRow >= rows
                        || nextColumn < 0 || nextColumn >= columns
                        || maze[nextRow][nextColumn] == 0
                        || distance[nextRow][nextColumn] != -1) {
                    continue;
                }

                distance[nextRow][nextColumn] = distance[row][column] + 1;
                queue.offer(new int[]{nextRow, nextColumn});
            }
        }

        return -1;
    }
}
