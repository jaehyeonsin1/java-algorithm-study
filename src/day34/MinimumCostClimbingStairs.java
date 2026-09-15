package day34;

public class MinimumCostClimbingStairs {

    /*
    [동적 계획법] 계단 오르기 최소 비용

    계단마다 밟을 때 지불해야 하는 비용이 담긴 배열 cost가 주어집니다.
    한 번에 계단을 한 칸 또는 두 칸 오를 수 있습니다.

    0번 계단 또는 1번 계단에서 출발할 수 있을 때,
    마지막 계단의 바로 다음 위치까지 올라가는 데 필요한
    최소 비용을 반환하세요.

    계단을 밟을 때만 해당 계단의 비용을 지불하며,
    마지막 계단의 다음 위치에서는 비용을 지불하지 않습니다.


    예시 1

    입력:
    cost = [10, 15, 20]

    출력:
    15

    설명:
    1번 계단에서 출발해 비용 15를 지불하고 두 칸 오르면
    마지막 계단의 다음 위치에 도착합니다.


    예시 2

    입력:
    cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]

    출력:
    6

    설명:
    비용이 1인 계단을 선택해 올라가면 최소 비용은 6입니다.


    예시 3

    입력:
    cost = [0, 0]

    출력:
    0


    제한 사항

    2 <= cost.length <= 100,000
    0 <= cost[i] <= 10,000
    정답은 int 범위 안에 있습니다.
    */

    public static void main(String[] args) {

        int[] cost = {10, 15, 20};

        int result = solution(cost);

        System.out.println(result); // 15
    }

    public static int solution(int[] cost) {

        // TODO: 직접 구현
        return -1;
    }
}
