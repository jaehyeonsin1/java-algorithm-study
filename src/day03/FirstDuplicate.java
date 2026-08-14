package day03;

import java.util.HashMap;
import java.util.Map;

public class FirstDuplicate {

    /*
    [문제] 가장 먼저 중복되는 숫자 찾기

    정수 배열 numbers가 주어졌을 때,
    배열을 왼쪽부터 확인하여 두 번째로 등장한 순간이
    가장 빠른 숫자를 반환하시오.

    중복되는 숫자가 없다면 -1을 반환하시오.

    예시 1
    입력:
    [1, 2, 3, 2, 3, 1]

    출력:
    2

    설명:
    2가 인덱스 3에서 두 번째로 등장하므로
    가장 먼저 중복된 숫자는 2이다.

    예시 2
    입력:
    [5, 1, 5, 2, 1]

    출력:
    5

    예시 3
    입력:
    [1, 2, 3, 4]

    출력:
    -1
    */

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 3, 1};

        int result = solution(numbers);

        System.out.println(result); // 2
    }

    public static int solution(int[] numbers) {

        // TODO: 직접 구현
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : numbers){
            map.put(number, map.getOrDefault(number, 0) + 1);
            if(map.get(number) == 2){
                return number;
            }
        }

        return -1;
    }
}