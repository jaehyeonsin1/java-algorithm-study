package day62;

public class NumberOfIslands {

    /*
    [그래프/DFS·BFS] 섬의 개수

    '1'(땅)과 '0'(물)으로 이루어진 m x n 크기의 격자 grid가 주어집니다.

    섬은 상하좌우로 인접한 땅이 연결되어 만들어지며,
    격자의 가장자리는 모두 물로 둘러싸여 있다고 가정합니다.

    grid에 존재하는 섬의 개수를 반환하세요.


    예시 1

    입력:
    grid = [["1", "1", "1", "1", "0"],
            ["1", "1", "0", "1", "0"],
            ["1", "1", "0", "0", "0"],
            ["0", "0", "0", "0", "0"]]

    출력:
    1


    예시 2

    입력:
    grid = [["1", "1", "0", "0", "0"],
            ["1", "1", "0", "0", "0"],
            ["0", "0", "1", "0", "0"],
            ["0", "0", "0", "1", "1"]]

    출력:
    3


    제한 사항

    1 <= grid.length, grid[i].length <= 300
    grid[i][j]는 '0' 또는 '1'입니다.
    */

    public static void main(String[] args) {

        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        int result = solution(grid);

        System.out.println(result); // 3
    }

    public static int solution(char[][] grid) {

        // TODO: 직접 구현
        return 0;
    }
}
