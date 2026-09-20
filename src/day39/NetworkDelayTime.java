package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime {

    /*
    [그래프/다익스트라] 네트워크 신호 전달 시간

    1번부터 nodeCount번까지 번호가 붙은 노드가 있습니다.
    방향이 있는 연결 정보 times의 각 원소 [from, to, time]은
    from에서 to로 신호가 전달되는 데 time만큼 걸린다는 뜻입니다.

    start 노드에서 동시에 신호를 보냈을 때 모든 노드가 신호를
    받는 데 걸리는 최소 시간을 반환하세요.

    모든 노드에 신호가 도달할 수 없다면 -1을 반환하세요.


    예시 1

    입력:
    times = [[2, 1, 1], [2, 3, 1], [3, 4, 1]]
    nodeCount = 4
    start = 2

    출력:
    2

    설명:
    1번과 3번 노드는 1만큼 걸리고, 4번 노드는 3번을 거쳐
    2만큼 걸립니다. 따라서 모든 노드가 받는 시간은 2입니다.


    예시 2

    입력:
    times = [[1, 2, 1]]
    nodeCount = 2
    start = 1

    출력:
    1


    예시 3

    입력:
    times = [[1, 2, 1]]
    nodeCount = 2
    start = 2

    출력:
    -1


    제한 사항

    1 <= nodeCount <= 100
    1 <= times.length <= 6,000
    times[i].length == 3
    1 <= times[i][0], times[i][1] <= nodeCount
    1 <= times[i][2] <= 100
    1 <= start <= nodeCount
    */

    public static void main(String[] args) {

        int[][] times = {
                {2, 1, 1},
                {2, 3, 1},
                {3, 4, 1}
        };
        int nodeCount = 4;
        int start = 2;

        int result = solution(times, nodeCount, start);

        System.out.println(result); // 2
    }

    public static int solution(int[][] times, int nodeCount, int start) {

        List<List<int[]>> graph = new ArrayList<>(nodeCount + 1);
        for (int node = 0; node <= nodeCount; node++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : times) {
            int from = edge[0];
            int to = edge[1];
            int travelTime = edge[2];

            graph.get(from).add(new int[]{to, travelTime});
        }

        int[] minimumTime = new int[nodeCount + 1];
        Arrays.fill(minimumTime, Integer.MAX_VALUE);
        minimumTime[start] = 0;

        PriorityQueue<int[]> queue = new PriorityQueue<>(
                Comparator.comparingInt(state -> state[1])
        );
        queue.offer(new int[]{start, 0});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentNode = current[0];
            int currentTime = current[1];

            if (currentTime > minimumTime[currentNode]) {
                continue;
            }

            for (int[] edge : graph.get(currentNode)) {
                int nextNode = edge[0];
                int travelTime = edge[1];
                int nextTime = currentTime + travelTime;

                if (nextTime >= minimumTime[nextNode]) {
                    continue;
                }

                minimumTime[nextNode] = nextTime;
                queue.offer(new int[]{nextNode, nextTime});
            }
        }

        int totalTime = 0;

        for (int node = 1; node <= nodeCount; node++) {
            if (minimumTime[node] == Integer.MAX_VALUE) {
                return -1;
            }

            totalTime = Math.max(totalTime, minimumTime[node]);
        }

        return totalTime;
    }
}
