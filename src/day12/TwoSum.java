package day12;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*
    [문제] 두 수의 합 찾기

    정수 배열 numbers와 정수 target이 주어졌을 때,
    서로 다른 두 인덱스의 숫자를 더해서 target을 만들 수 있으면
    해당 두 인덱스를 배열로 반환하시오.

    정답은 하나만 존재한다고 가정한다.


    예시 1

    입력:
    numbers = [2, 7, 11, 15]
    target = 9

    출력:
    [0, 1]

    설명:
    numbers[0] + numbers[1]
    = 2 + 7
    = 9


    예시 2

    입력:
    numbers = [3, 2, 4]
    target = 6

    출력:
    [1, 2]

    설명:
    2 + 4 = 6
    */

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution(numbers, target);

        System.out.println(result[0] + " " + result[1]); // 0 1
    }

    public static int[] solution(int[] numbers, int target) {

        // TODO: 직접 구현
        /*for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i, j};
                }
            }
        }*/
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            int need = target - numbers[i];

            if(map.containsKey(need)){
                return new int[]{map.get(need), i};
            }

            map.put(numbers[i], i);
        }

        return new int[]{-1, -1};
    }
}