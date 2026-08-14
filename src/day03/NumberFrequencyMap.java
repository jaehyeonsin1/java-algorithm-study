package day03;

import java.util.HashMap;
import java.util.Map;

public class NumberFrequencyMap {

    /*
    [문제] 숫자별 등장 횟수 구하기

    정수 배열 numbers가 주어졌을 때,
    각 숫자가 배열에서 몇 번 등장했는지 저장하여 반환하시오.

    예시

    입력:
    [1, 2, 3, 2, 2, 5, 3]

    출력:
    {1=1, 2=3, 3=2, 5=1}

    설명:
    1은 1번
    2는 3번
    3은 2번
    5는 1번 등장한다.
    */

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 2, 5, 3};

        Map<Integer, Integer> result = solution(numbers);

        System.out.println(result);
    }

    public static Map<Integer, Integer> solution(int[] numbers) {

        Map<Integer, Integer> map = new HashMap<>();

        // TODO: 직접 구현
        for(int number : numbers){
            if(!map.containsKey(number)){
                map.put(number, 1);
            }else {
                map.put(number, map.get(number) + 1);
            }
        }

        /*for(int number : numbers){
            map.put(number, map.getOrDefault(number, 0) + 1);
          }
        */

        return map;
    }
}