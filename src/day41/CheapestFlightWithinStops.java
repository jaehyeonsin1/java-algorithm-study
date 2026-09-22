package day41;

import java.util.Arrays;

public class CheapestFlightWithinStops {

    /*
    [그래프/벨만-포드] 경유 횟수 제한이 있는 최저 항공권

    0번부터 cityCount - 1번까지 번호가 붙은 도시가 있습니다.
    항공편 정보 flights의 각 원소 [from, to, price]는
    from에서 to로 가는 항공편의 가격이 price라는 뜻입니다.

    source에서 destination까지 최대 maxStops개의 도시를 경유해서
    이동할 때 필요한 최소 비용을 반환하세요.

    조건을 만족하는 경로가 없다면 -1을 반환하세요.


    예시 1

    입력:
    cityCount = 4
    flights = [[0, 1, 100], [1, 2, 100], [2, 3, 100],
               [0, 2, 500], [0, 3, 1000]]
    source = 0
    destination = 3
    maxStops = 1

    출력:
    600

    설명:
    0 -> 2 -> 3 경로는 2번 도시 하나를 경유하며 비용은 600입니다.


    예시 2

    입력:
    cityCount = 4
    flights = [[0, 1, 100], [1, 2, 100], [2, 3, 100],
               [0, 2, 500], [0, 3, 1000]]
    source = 0
    destination = 3
    maxStops = 2

    출력:
    300

    설명:
    0 -> 1 -> 2 -> 3 경로는 두 도시를 경유하며 비용은 300입니다.


    예시 3

    입력:
    cityCount = 3
    flights = [[0, 1, 100], [1, 2, 100]]
    source = 2
    destination = 0
    maxStops = 1

    출력:
    -1


    제한 사항

    1 <= cityCount <= 100
    0 <= flights.length <= 10,000
    flights[i].length == 3
    0 <= flights[i][0], flights[i][1] < cityCount
    1 <= flights[i][2] <= 10,000
    0 <= source, destination < cityCount
    0 <= maxStops < cityCount
    정답은 int 범위 안에 있습니다.
    */

    public static void main(String[] args) {

        int cityCount = 4;
        int[][] flights = {
                {0, 1, 100},
                {1, 2, 100},
                {2, 3, 100},
                {0, 2, 500},
                {0, 3, 1000}
        };
        int source = 0;
        int destination = 3;
        int maxStops = 1;

        int result = solution(
                cityCount,
                flights,
                source,
                destination,
                maxStops
        );

        System.out.println(result); // 600
    }

    public static int solution(
            int cityCount,
            int[][] flights,
            int source,
            int destination,
            int maxStops
    ) {

        int[] previousCost = new int[cityCount];
        Arrays.fill(previousCost, Integer.MAX_VALUE);
        previousCost[source] = 0;

        for (int usedEdges = 1; usedEdges <= maxStops + 1; usedEdges++) {
            int[] currentCost = Arrays.copyOf(previousCost, cityCount);

            for (int[] flight : flights) {
                int from = flight[0];
                int to = flight[1];
                int price = flight[2];

                if (previousCost[from] == Integer.MAX_VALUE) {
                    continue;
                }

                currentCost[to] = Math.min(
                        currentCost[to],
                        previousCost[from] + price
                );
            }

            previousCost = currentCost;
        }

        return previousCost[destination] == Integer.MAX_VALUE
                ? -1
                : previousCost[destination];
    }
}
