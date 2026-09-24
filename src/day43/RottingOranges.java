package day43;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottingOranges {

    /*
    [그래프/다중 시작점 BFS] 썩어가는 오렌지

    오렌지 상자를 나타내는 2차원 배열 grid가 주어집니다.

    각 칸의 값은 다음을 의미합니다.

    0: 빈칸
    1: 신선한 오렌지
    2: 썩은 오렌지

    매분마다 썩은 오렌지와 상하좌우로 인접한 신선한 오렌지는
    동시에 썩게 됩니다.

    모든 신선한 오렌지가 썩는 데 걸리는 최소 시간을 반환하세요.
    모든 오렌지를 썩게 만들 수 없다면 -1을 반환하세요.
    처음부터 신선한 오렌지가 없다면 0을 반환하세요.


    예시 1

    입력:
    grid = [
        [2, 1, 1],
        [1, 1, 0],
        [0, 1, 1]
    ]

    출력:
    4

    설명:
    처음에 썩은 오렌지에서 시작해 인접한 신선한 오렌지가
    매분 차례로 썩으며, 4분 후 모든 오렌지가 썩습니다.


    예시 2

    입력:
    grid = [
        [2, 1, 1],
        [0, 1, 1],
        [1, 0, 1]
    ]

    출력:
    -1

    설명:
    왼쪽 아래의 신선한 오렌지는 다른 오렌지와 연결되어 있지 않아
    끝까지 썩지 않습니다.


    예시 3

    입력:
    grid = [[0, 2]]

    출력:
    0

    설명:
    신선한 오렌지가 없으므로 시간이 걸리지 않습니다.


    제한 사항

    1 <= grid.length <= 100
    1 <= grid[0].length <= 100
    grid[row][column]은 0, 1, 2 중 하나입니다.
    */

    public static void main(String[] args) {

        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        int result = solution(grid);

        System.out.println(result); // 4
    }

    public static int solution(int[][] grid) {

        Queue<int[]> queue = new ArrayDeque<>();
        int freshOrangeCount = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                if (grid[row][column] == 1) {
                    freshOrangeCount++;
                } else if (grid[row][column] == 2) {
                    queue.offer(new int[]{row, column});
                }
            }
        }

        int[][] directions = {
                {-1, 0},
                {1, 0},
                {0, -1},
                {0, 1}
        };

        int minutes = 0;

        while (!queue.isEmpty() && freshOrangeCount > 0) {
            int rottenOrangeCount = queue.size();

            for (int count = 0; count < rottenOrangeCount; count++) {
                int[] current = queue.poll();

                for (int[] direction : directions) {
                    int nextRow = current[0] + direction[0];
                    int nextColumn = current[1] + direction[1];

                    if (nextRow < 0 || nextRow >= grid.length
                            || nextColumn < 0 || nextColumn >= grid[0].length
                            || grid[nextRow][nextColumn] != 1) {
                        continue;
                    }

                    grid[nextRow][nextColumn] = 2;
                    freshOrangeCount--;
                    queue.offer(new int[]{nextRow, nextColumn});
                }
            }

            minutes++;
        }

        return freshOrangeCount == 0 ? minutes : -1;
    }
}
