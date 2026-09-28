package day47;

import java.util.Arrays;

public class RedundantConnection {

    /*
    [그래프/유니온 파인드] 중복 연결 찾기

    1번부터 n번까지 번호가 붙은 n개의 노드가 있습니다.
    처음에는 사이클이 없는 트리였지만, 서로 다른 두 노드를 연결하는 간선 하나가
    추가되어 edges가 만들어졌습니다.

    edges[i] = [nodeA, nodeB]는 nodeA와 nodeB를 연결하는
    방향이 없는 간선을 의미합니다.

    추가된 간선을 제거하여 다시 트리로 만들 수 있도록
    제거할 간선 하나를 반환하세요.

    정답이 여러 개라면 edges에서 가장 나중에 등장하는 간선을 반환하세요.


    예시 1

    입력:
    edges = [[1, 2], [1, 3], [2, 3]]

    출력:
    [2, 3]

    설명:
    [2, 3]을 제거하면 모든 노드가 연결되어 있으면서 사이클이 없는 트리가 됩니다.


    예시 2

    입력:
    edges = [[1, 2], [2, 3], [3, 4], [1, 4], [1, 5]]

    출력:
    [1, 4]

    설명:
    [1, 4]가 추가되면서 1 - 2 - 3 - 4 - 1 사이클이 만들어집니다.


    제한 사항

    3 <= edges.length <= 1000
    edges.length == n
    edges[i].length == 2
    1 <= nodeA < nodeB <= n
    중복되는 간선은 없습니다.
    주어진 그래프는 연결되어 있습니다.
    */

    public static void main(String[] args) {

        int[][] edges = {
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 4},
                {1, 5}
        };

        int[] result = solution(edges);

        System.out.println(Arrays.toString(result)); // [1, 4]
    }

    public static int[] solution(int[][] edges) {

        // TODO: 직접 구현
        return new int[0];
    }
}
