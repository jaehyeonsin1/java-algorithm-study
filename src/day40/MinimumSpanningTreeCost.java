package day40;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumSpanningTreeCost {

    /*
    [그래프/최소 신장 트리] 모든 도시를 연결하는 최소 비용

    1번부터 cityCount번까지 번호가 붙은 도시가 있습니다.
    도시 사이의 도로 정보 connections의 각 원소 [cityA, cityB, cost]는
    두 도시를 양방향으로 연결하는 데 cost만큼 든다는 뜻입니다.

    모든 도시가 서로 이동할 수 있도록 연결하는 최소 비용을 반환하세요.
    모든 도시를 연결할 수 없다면 -1을 반환하세요.


    예시 1

    입력:
    cityCount = 4
    connections = [[1, 2, 1], [2, 3, 2], [3, 4, 1],
                   [1, 4, 4], [1, 3, 3]]

    출력:
    4

    설명:
    [1, 2, 1], [3, 4, 1], [2, 3, 2] 도로를 선택하면
    총비용 4로 모든 도시를 연결할 수 있습니다.


    예시 2

    입력:
    cityCount = 3
    connections = [[1, 2, 5]]

    출력:
    -1

    설명:
    3번 도시를 연결할 방법이 없습니다.


    예시 3

    입력:
    cityCount = 1
    connections = []

    출력:
    0


    제한 사항

    1 <= cityCount <= 10,000
    0 <= connections.length <= 50,000
    connections[i].length == 3
    1 <= connections[i][0], connections[i][1] <= cityCount
    1 <= connections[i][2] <= 100,000
    같은 두 도시를 연결하는 도로가 여러 개 주어질 수 있습니다.
    정답은 int 범위 안에 있습니다.
    */

    public static void main(String[] args) {

        int cityCount = 4;
        int[][] connections = {
                {1, 2, 1},
                {2, 3, 2},
                {3, 4, 1},
                {1, 4, 4},
                {1, 3, 3}
        };

        int result = solution(cityCount, connections);

        System.out.println(result); // 4
    }

    public static int solution(int cityCount, int[][] connections) {

        Arrays.sort(connections, Comparator.comparingInt(edge -> edge[2]));

        DisjointSet disjointSet = new DisjointSet(cityCount);
        int totalCost = 0;
        int selectedEdgeCount = 0;

        for (int[] connection : connections) {
            int cityA = connection[0];
            int cityB = connection[1];
            int cost = connection[2];

            if (!disjointSet.union(cityA, cityB)) {
                continue;
            }

            totalCost += cost;
            selectedEdgeCount++;

            if (selectedEdgeCount == cityCount - 1) {
                return totalCost;
            }
        }

        return cityCount == 1 ? 0 : -1;
    }

    private static class DisjointSet {

        private final int[] parent;
        private final int[] rank;

        private DisjointSet(int size) {
            parent = new int[size + 1];
            rank = new int[size + 1];

            for (int node = 1; node <= size; node++) {
                parent[node] = node;
            }
        }

        private int find(int node) {
            if (parent[node] != node) {
                parent[node] = find(parent[node]);
            }

            return parent[node];
        }

        private boolean union(int nodeA, int nodeB) {
            int rootA = find(nodeA);
            int rootB = find(nodeB);

            if (rootA == rootB) {
                return false;
            }

            if (rank[rootA] < rank[rootB]) {
                parent[rootA] = rootB;
            } else if (rank[rootA] > rank[rootB]) {
                parent[rootB] = rootA;
            } else {
                parent[rootB] = rootA;
                rank[rootA]++;
            }

            return true;
        }
    }
}
