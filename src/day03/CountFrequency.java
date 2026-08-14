package day03;

import java.util.Arrays;

public class CountFrequency {
    /*
    [문제] 숫자 등장 횟수 세기

    정수 배열 numbers와 정수 target이 주어졌을 때,
    배열에서 target이 몇 번 등장하는지 반환하시오.

    예시 1
    입력:
    numbers = [1, 2, 3, 2, 2, 5]
    target = 2

    출력: 3

    예시 2
    입력:
    numbers = [1, 2, 3, 4, 5]
    target = 7

    출력: 0
    */

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 2, 5};
        int target = 2;

        int result = solution(numbers, target);

        System.out.println(result); // 3
    }

    public static int solution(int[] numbers, int target) {

        // TODO: 직접 구현
        int count = 0;

        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }

        //return (int) Arrays.stream(numbers).filter(n -> n == target).count();

        return count;
    }
}

