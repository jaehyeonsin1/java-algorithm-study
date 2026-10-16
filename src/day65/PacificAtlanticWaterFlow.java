package day65;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {

    /*
    [그래프/DFS·BFS] 태평양과 대서양으로 흐르는 물

    m x n 크기의 섬이 있고, 각 칸의 높이를 나타내는 정수 배열 heights가 주어집니다.

    태평양은 섬의 왼쪽과 위쪽에 있고,
    대서양은 섬의 오른쪽과 아래쪽에 있습니다.

    빗물은 현재 칸과 높이가 같거나 더 낮은 상하좌우 인접 칸으로 흐를 수 있습니다.
    태평양과 대서양 양쪽 모두로 물이 흐를 수 있는 모든 칸의 좌표를 반환하세요.

    반환 순서는 상관없습니다.


    예시 1

    입력:
    heights = [[1, 2, 2, 3, 5],
               [3, 2, 3, 4, 4],
               [2, 4, 5, 3, 1],
               [6, 7, 1, 4, 5],
               [5, 1, 1, 2, 4]]

    출력:
    [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]]

    설명:
    위 좌표의 칸에서 시작한 물은 태평양과 대서양 양쪽 모두에 도달할 수 있습니다.


    예시 2

    입력:
    heights = [[1]]

    출력:
    [[0, 0]]

    설명:
    하나뿐인 칸은 두 바다에 모두 접해 있습니다.


    제한 사항

    1 <= heights.length, heights[i].length <= 200
    0 <= heights[i][j] <= 100000
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

        // TODO: 직접 구현
        return new ArrayList<>();
    }
}
