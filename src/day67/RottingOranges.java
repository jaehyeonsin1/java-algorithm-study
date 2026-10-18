package day67;

public class RottingOranges {

    /*
    [그래프/BFS] 썩어가는 오렌지

    m x n 크기의 격자 grid가 주어집니다.

    각 칸의 값은 다음을 의미합니다.
    0: 빈칸
    1: 신선한 오렌지
    2: 썩은 오렌지

    매분마다 썩은 오렌지와 상하좌우로 인접한 신선한 오렌지가 썩습니다.

    모든 신선한 오렌지가 썩는 데 필요한 최소 시간을 반환하세요.
    모든 오렌지를 썩게 만들 수 없다면 -1을 반환합니다.


    예시 1

    입력:
    grid = [[2, 1, 1],
            [1, 1, 0],
            [0, 1, 1]]

    출력:
    4


    예시 2

    입력:
    grid = [[2, 1, 1],
            [0, 1, 1],
            [1, 0, 1]]

    출력:
    -1

    설명:
    왼쪽 아래의 신선한 오렌지는 썩은 오렌지와 연결되어 있지 않아
    썩게 만들 수 없습니다.


    예시 3

    입력:
    grid = [[0, 2]]

    출력:
    0

    설명:
    처음부터 신선한 오렌지가 없으므로 0분이 필요합니다.


    제한 사항

    1 <= grid.length, grid[i].length <= 10
    grid[i][j]는 0, 1 또는 2입니다.
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

        // TODO: 직접 구현
        return 0;
    }
}
