package day26;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class FarthestNodes {

    /*
    [그래프/BFS] 가장 먼 노드의 개수

    1번부터 n번까지 번호가 붙은 노드와 양방향 간선이 있습니다.
    간선 정보 edge의 각 행 [a, b]는 a번 노드와 b번 노드가
    서로 연결되어 있다는 뜻입니다.

    1번 노드에서 최단 경로로 이동했을 때 가장 멀리 떨어진
    노드의 개수를 반환하세요.


    예시 1

    입력:
    n = 6
    edge = [[3, 6], [4, 3], [3, 2], [1, 3],
            [1, 2], [2, 4], [5, 2]]

    출력:
    3

    설명:
    1번 노드에서 4번, 5번, 6번 노드까지의 최단 거리는 2로
    가장 멀기 때문에 정답은 3입니다.


    예시 2

    입력:
    n = 4
    edge = [[1, 2], [2, 3], [3, 4]]

    출력:
    1


    제한 사항

    2 <= n <= 20,000
    1 <= edge.length <= 50,000
    edge[i].length == 2
    1 <= edge[i][0], edge[i][1] <= n
    자기 자신을 연결하는 간선은 없습니다.
    모든 노드는 1번 노드에서 도달할 수 있습니다.
    */

    public static void main(String[] args) {

        int n = 6;
        int[][] edge = {
                {3, 6},
                {4, 3},
                {3, 2},
                {1, 3},
                {1, 2},
                {2, 4},
                {5, 2}
        };

        int result = solution(n, edge);

        System.out.println(result); // 3
    }

    public static int solution(int n, int[][] edge) {

        List<List<Integer>> graph = new ArrayList<>(n + 1);
        for (int node = 0; node <= n; node++) {
            graph.add(new ArrayList<>());
        }

        for (int[] connection : edge) {
            int nodeA = connection[0];
            int nodeB = connection[1];

            graph.get(nodeA).add(nodeB);
            graph.get(nodeB).add(nodeA);
        }

        int[] distance = new int[n + 1];
        Arrays.fill(distance, -1);

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        distance[1] = 0;

        int maximumDistance = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : graph.get(current)) {
                if (distance[next] != -1) {
                    continue;
                }

                distance[next] = distance[current] + 1;
                maximumDistance = Math.max(maximumDistance, distance[next]);
                queue.offer(next);
            }
        }

        int count = 0;
        for (int node = 1; node <= n; node++) {
            if (distance[node] == maximumDistance) {
                count++;
            }
        }

        return count;
    }
}
