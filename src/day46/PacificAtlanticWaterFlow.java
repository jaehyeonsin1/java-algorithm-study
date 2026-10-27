package day46;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class PacificAtlanticWaterFlow {

    /*
    [그래프/DFS·BFS] 태평양과 대서양으로 흐르는 물

    각 칸의 높이를 나타내는 m x n 크기의 2차원 배열 heights가 주어집니다.

    배열의 위쪽과 왼쪽 가장자리는 태평양에 닿아 있고,
    아래쪽과 오른쪽 가장자리는 대서양에 닿아 있습니다.

    물은 현재 칸과 높이가 같거나 더 낮은 상하좌우 인접 칸으로 흐를 수 있습니다.
    태평양과 대서양 양쪽 모두로 물이 흐를 수 있는 모든 칸의 좌표를 반환하세요.

    각 좌표는 [row, column] 형태이며, 반환 순서는 상관없습니다.


    예시 1

    입력:
    heights = [
        [1, 2, 2, 3, 5],
        [3, 2, 3, 4, 4],
        [2, 4, 5, 3, 1],
        [6, 7, 1, 4, 5],
        [5, 1, 1, 2, 4]
    ]

    출력:
    [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]]

    설명:
    출력에 포함된 각 칸에서는 높이가 같거나 낮은 칸을 따라 이동하여
    태평양과 대서양 양쪽에 모두 도달할 수 있습니다.


    예시 2

    입력:
    heights = [[1]]

    출력:
    [[0, 0]]

    설명:
    하나뿐인 칸은 태평양과 대서양에 모두 닿아 있습니다.


    제한 사항

    1 <= heights.length <= 200
    1 <= heights[row].length <= 200
    0 <= heights[row][column] <= 100000
    */

    public static void main(String[] args) {

        int[][] heights = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };

        List<List<Integer>> result = solution(heights);

        System.out.println(result);
        // [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]]
    }

    public static List<List<Integer>> solution(int[][] heights) {

        int rows = heights.length;
        int columns = heights[0].length;

        boolean[][] pacific = new boolean[rows][columns];
        boolean[][] atlantic = new boolean[rows][columns];

        List<List<Integer>> result = new ArrayList<>();

        markReachableFromOcean(heights, pacific, true);
        markReachableFromOcean(heights, atlantic, false);

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (pacific[row][column] && atlantic[row][column]) {
                    List<Integer> coordinate = new ArrayList<>(2);
                    coordinate.add(row);
                    coordinate.add(column);
                    result.add(coordinate);
                }
            }
        }

        return result;
    }

    private static void markReachableFromOcean(
            int[][] heights,
            boolean[][] reachable,
            boolean isPacific
    ) {
        int rows = heights.length;
        int columns = heights[0].length;
        Queue<int[]> queue = new ArrayDeque<>();

        if (isPacific) {
            for (int column = 0; column < columns; column++) {
                addIfNotVisited(0, column, reachable, queue);
            }
            for (int row = 0; row < rows; row++) {
                addIfNotVisited(row, 0, reachable, queue);
            }
        } else {
            for (int column = 0; column < columns; column++) {
                addIfNotVisited(rows - 1, column, reachable, queue);
            }
            for (int row = 0; row < rows; row++) {
                addIfNotVisited(row, columns - 1, reachable, queue);
            }
        }

        int[][] directions = {
                {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int column = current[1];

            for (int[] direction : directions) {
                int nextRow = row + direction[0];
                int nextColumn = column + direction[1];

                if (nextRow >= 0 && nextRow < rows
                        && nextColumn >= 0 && nextColumn < columns
                        && !reachable[nextRow][nextColumn]
                        && heights[nextRow][nextColumn] >= heights[row][column]) {
                    addIfNotVisited(nextRow, nextColumn, reachable, queue);
                }
            }
        }
    }

    private static void addIfNotVisited(
            int row,
            int column,
            boolean[][] reachable,
            Queue<int[]> queue
    ) {
        if (!reachable[row][column]) {
            reachable[row][column] = true;
            queue.offer(new int[]{row, column});
        }
    }
}
