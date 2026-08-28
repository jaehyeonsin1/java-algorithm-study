package day15;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /*
    [문제] 가장 많이 등장하는 숫자 찾기

    정수 배열 numbers가 주어졌을 때,
    배열 길이의 절반보다 많이 등장하는 숫자를 반환하시오.

    정답이 되는 숫자는 반드시 존재한다고 가정한다.


    예시 1

    입력:
    numbers = [3, 2, 3]

    출력:
    3


    예시 2

    입력:
    numbers = [2, 2, 1, 1, 1, 2, 2]

    출력:
    2
    */

    public static void main(String[] args) {

        int[] numbers = {2, 2, 1, 1, 1, 2, 2};

        int result = solution(numbers);

        System.out.println(result); // 2
    }

    public static int solution(int[] numbers) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int number : numbers) {

            int count = map.getOrDefault(number, 0) + 1;

            map.put(number, count);

            if (count > numbers.length / 2) {
                return number;
            }
        }

        return -1;
    }
}