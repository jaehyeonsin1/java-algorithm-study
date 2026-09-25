package day44;

public class ShortestPathInBinaryMatrix {

    /*
    [그래프/BFS] 가장 짧은 이진 행렬 경로

    0과 1로 이루어진 n x n 크기의 2차원 배열 grid가 주어집니다.

    0은 이동할 수 있는 칸이고, 1은 이동할 수 없는 칸입니다.
    왼쪽 위 칸 (0, 0)에서 시작해 오른쪽 아래 칸 (n - 1, n - 1)까지
    이동하는 가장 짧은 경로의 길이를 반환하세요.

    한 번 이동할 때 상하좌우와 대각선을 포함한 8방향으로 이동할 수 있습니다.
    경로의 길이는 방문한 칸의 개수입니다.

    이동할 수 있는 경로가 없다면 -1을 반환하세요.


    예시 1

    입력:
    grid = [
        [0, 1],
        [1, 0]
    ]

    출력:
    2

    설명:
    왼쪽 위에서 오른쪽 아래로 대각선 이동하면
    2개의 칸을 방문하여 도착할 수 있습니다.


    예시 2

    입력:
    grid = [
        [0, 0, 0],
        [1, 1, 0],
        [1, 1, 0]
    ]

    출력:
    4

    설명:
    (0, 0)에서 출발해 4개의 칸을 방문하는 경로가 가장 짧습니다.


    예시 3

    입력:
    grid = [
        [1, 0],
        [0, 0]
    ]

    출력:
    -1

    설명:
    시작 칸이 막혀 있으므로 이동할 수 없습니다.


    제한 사항

    1 <= grid.length <= 100
    grid.length == grid[row].length
    grid[row][column]은 0 또는 1입니다.
    */

    public static void main(String[] args) {

        int[][] grid = {
                {0, 0, 0},
                {1, 1, 0},
                {1, 1, 0}
        };

        int result = solution(grid);

        System.out.println(result); // 4
    }

    public static int solution(int[][] grid) {

        // TODO: 직접 구현
        return 0;
    }
}
