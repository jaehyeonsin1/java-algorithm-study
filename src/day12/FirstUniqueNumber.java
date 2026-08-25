package day12;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueNumber {

    /*
    [문제] 가장 먼저 등장하는 중복되지 않은 숫자 찾기

    정수 배열 numbers가 주어졌을 때,
    배열에서 단 한 번만 등장하는 숫자 중
    가장 먼저 등장하는 숫자를 반환하시오.

    모든 숫자가 두 번 이상 등장한다면 -1을 반환하시오.


    예시 1

    입력:
    numbers = [4, 5, 1, 2, 1, 4, 5]

    출력:
    2

    설명:

    4 → 2번
    5 → 2번
    1 → 2번
    2 → 1번

    한 번만 등장한 숫자는 2이므로
    2를 반환한다.


    예시 2

    입력:
    numbers = [2, 3, 2, 4, 3, 5]

    출력:
    4

    설명:

    한 번만 등장하는 숫자는 4와 5이고,
    배열에서 4가 먼저 등장하므로 4를 반환한다.


    예시 3

    입력:
    numbers = [1, 1, 2, 2, 3, 3]

    출력:
    -1
    */

    public static void main(String[] args) {

        int[] numbers = {4, 5, 1, 2, 1, 4, 5};

        int result = solution(numbers);

        System.out.println(result); // 2
    }

    public static int solution(int[] numbers) {

        Map<Integer, Integer> map = new HashMap<>();

        // TODO: 직접 구현
        for(int number : numbers){
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        for(int number : numbers){
            if(map.get(number) == 1){
                return number;
            }
        }

        return -1;
    }
}