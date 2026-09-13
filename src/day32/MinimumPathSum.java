package day32;

public class MinimumPathSum {

    /*
    [동적 계획법] 격자의 최소 경로 합

    음이 아닌 정수가 담긴 2차원 배열 grid가 주어집니다.
    왼쪽 위 칸에서 출발해 오른쪽 또는 아래쪽으로만 이동하여
    오른쪽 아래 칸에 도착할 때 지나간 숫자 합의 최솟값을 반환하세요.

    출발 칸과 도착 칸의 숫자도 합에 포함합니다.


    예시 1

    입력:
    grid = [
        [1, 3, 1],
        [1, 5, 1],
        [4, 2, 1]
    ]

    출력:
    7

    설명:
    1 -> 3 -> 1 -> 1 -> 1 경로의 합이 7로 가장 작습니다.


    예시 2

    입력:
    grid = [
        [1, 2, 3],
        [4, 5, 6]
    ]

    출력:
    12


    예시 3

    입력:
    grid = [[5]]

    출력:
    5


    제한 사항

    1 <= grid.length <= 200
    1 <= grid[i].length <= 200
    0 <= grid[i][j] <= 10,000
    모든 행의 길이는 같습니다.
    정답은 int 범위 안에 있습니다.
    */

    public static void main(String[] args) {

        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        int result = solution(grid);

        System.out.println(result); // 7
    }

    public static int solution(int[][] grid) {

        int rows = grid.length;
        int columns = grid[0].length;
        int[] minimumSum = new int[columns];

        minimumSum[0] = grid[0][0];

        for (int column = 1; column < columns; column++) {
            minimumSum[column] = minimumSum[column - 1] + grid[0][column];
        }

        for (int row = 1; row < rows; row++) {
            minimumSum[0] += grid[row][0];

            for (int column = 1; column < columns; column++) {
                minimumSum[column] = Math.min(
                        minimumSum[column],
                        minimumSum[column - 1]
                ) + grid[row][column];
            }
        }

        return minimumSum[columns - 1];
    }
}
