package day15;

import java.util.HashMap;
import java.util.Map;

public class SameFrequency {

    /*
    [문제] 두 배열의 숫자 빈도 비교하기

    두 정수 배열 numbers1과 numbers2가 주어졌을 때,
    두 배열에 등장하는 숫자와 각 숫자의 등장 횟수가
    모두 같으면 true를 반환하시오.

    숫자의 순서는 달라도 상관없다.


    예시 1

    입력:
    numbers1 = [1, 2, 2, 3]
    numbers2 = [3, 2, 1, 2]

    출력:
    true

    설명:

    numbers1
    1 → 1번
    2 → 2번
    3 → 1번

    numbers2도 동일하므로 true.


    예시 2

    입력:
    numbers1 = [1, 2, 2, 3]
    numbers2 = [1, 2, 3, 3]

    출력:
    false

    설명:
    2와 3의 등장 횟수가 서로 다르다.


    예시 3

    입력:
    numbers1 = [1, 1, 2]
    numbers2 = [1, 2]

    출력:
    false
    */

    public static void main(String[] args) {

        int[] numbers1 = {1, 2, 2, 3};
        int[] numbers2 = {3, 2, 1, 2};

        boolean result = solution(numbers1, numbers2);

        System.out.println(result); // true
    }

    public static boolean solution(int[] numbers1, int[] numbers2) {

        if (numbers1.length != numbers2.length) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int number : numbers1) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }


        for (int number : numbers2) {

            if (!map.containsKey(number)) {
                return false;
            }

            int count = map.get(number);

            if (count == 0) {
                return false;
            }

            map.put(number, count - 1);
        }

        return true;
    }
}