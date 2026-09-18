package day37;

public class ZeroOneKnapsack {

    /*
    [동적 계획법] 0/1 배낭의 최대 가치

    물건의 무게가 담긴 배열 weights와 각 물건의 가치가 담긴 배열 values,
    배낭이 견딜 수 있는 최대 무게 capacity가 주어집니다.

    각 물건은 한 번만 선택할 수 있으며, 선택한 물건들의 무게 합이
    capacity를 넘지 않도록 할 때 얻을 수 있는 최대 가치의 합을 반환하세요.


    예시 1

    입력:
    weights = [2, 3, 4, 5]
    values = [3, 4, 5, 6]
    capacity = 5

    출력:
    7

    설명:
    무게가 2와 3인 물건을 선택하면 총 무게는 5이고,
    총 가치는 3 + 4 = 7입니다.


    예시 2

    입력:
    weights = [1, 2, 3]
    values = [6, 10, 12]
    capacity = 5

    출력:
    22

    설명:
    무게가 2와 3인 물건을 선택하면 총 가치는 22입니다.


    예시 3

    입력:
    weights = [5]
    values = [10]
    capacity = 4

    출력:
    0

    설명:
    물건의 무게가 배낭의 최대 무게보다 크므로 선택할 수 없습니다.


    제한 사항

    1 <= weights.length <= 100
    weights.length == values.length
    1 <= weights[i] <= 1,000
    0 <= values[i] <= 10,000
    1 <= capacity <= 10,000
    정답은 int 범위 안에 있습니다.
    */

    public static void main(String[] args) {

        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 5;

        int result = solution(weights, values, capacity);

        System.out.println(result); // 7
    }

    public static int solution(int[] weights, int[] values, int capacity) {

        // TODO: 직접 구현
        return -1;
    }
}
