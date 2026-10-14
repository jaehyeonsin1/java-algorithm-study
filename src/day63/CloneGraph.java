package day63;

import java.util.ArrayList;
import java.util.List;

public class CloneGraph {

    /*
    [그래프/DFS·BFS] 그래프 복제

    연결된 무방향 그래프의 한 노드가 주어집니다.

    각 노드는 정수 값 val과 이웃 노드 목록 neighbors를 가집니다.
    원본 그래프와 같은 구조와 값을 가지는 깊은 복사본을 만들어 반환하세요.

    깊은 복사본의 모든 노드는 새로 생성되어야 하며,
    복사본의 이웃 관계도 원본 그래프와 동일해야 합니다.


    예시 1

    입력:
    adjList = [[2, 4], [1, 3], [2, 4], [1, 3]]

    출력:
    [[2, 4], [1, 3], [2, 4], [1, 3]]

    설명:
    그래프에는 4개의 노드가 있습니다.
    1번 노드는 2번, 4번 노드와 연결되어 있고,
    2번 노드는 1번, 3번 노드와 연결되어 있습니다.
    복제된 그래프는 같은 연결 관계를 가지지만 모든 노드는 새 객체입니다.


    예시 2

    입력:
    adjList = [[]]

    출력:
    [[]]

    설명:
    그래프에는 이웃이 없는 노드 하나만 있습니다.


    예시 3

    입력:
    adjList = []

    출력:
    []


    제한 사항

    그래프의 노드 수는 0개 이상 100개 이하입니다.
    1 <= Node.val <= 100
    각 노드의 val은 서로 다릅니다.
    그래프에는 중복 간선과 자기 자신을 연결하는 간선이 없습니다.
    그래프는 연결되어 있으며, 주어진 노드에서 모든 노드를 방문할 수 있습니다.
    */

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Node result = solution(node1);

        System.out.println(result); // 1 -> [2, 4]
    }

    public static Node solution(Node node) {

        // TODO: 직접 구현
        return null;
    }

    static class Node {

        int val;
        List<Node> neighbors;

        Node(int val) {
            this.val = val;
            this.neighbors = new ArrayList<>();
        }

        @Override
        public String toString() {
            List<Integer> neighborValues = new ArrayList<>();

            for (Node neighbor : neighbors) {
                neighborValues.add(neighbor.val);
            }

            return val + " -> " + neighborValues;
        }
    }
}
