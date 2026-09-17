package day36;

public class UniquePathsWithObstacles {

    /*
    [동적 계획법] 장애물이 있는 격자의 경로 개수

    0과 1로 이루어진 2차원 배열 grid가 주어집니다.
    0은 이동할 수 있는 칸이고, 1은 이동할 수 없는 장애물입니다.

    왼쪽 위 칸에서 출발해 오른쪽 또는 아래쪽으로만 이동하여
    오른쪽 아래 칸에 도착하는 서로 다른 경로의 개수를 반환하세요.

    출발점이나 도착점이 장애물이라면 0을 반환하세요.


    예시 1

    입력:
    grid = [
        [0, 0, 0],
        [0, 1, 0],
        [0, 0, 0]
    ]

    출력:
    2

    설명:
    가운데 장애물을 피해 오른쪽으로 먼저 이동하는 경로와
    아래쪽으로 먼저 이동하는 경로가 있습니다.


    예시 2

    입력:
    grid = [
        [0, 1],
        [0, 0]
    ]

    출력:
    1


    예시 3

    입력:
    grid = [[1]]

    출력:
    0


    제한 사항

    1 <= grid.length <= 100
    1 <= grid[i].length <= 100
    grid[i][j]는 0 또는 1입니다.
    모든 행의 길이는 같습니다.
    정답은 int 범위 안에 있습니다.
    */

    public static void main(String[] args) {

        int[][] grid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        int result = solution(grid);

        System.out.println(result); // 2
    }

    public static int solution(int[][] grid) {

        // TODO: 직접 구현
        return -1;
    }
}
