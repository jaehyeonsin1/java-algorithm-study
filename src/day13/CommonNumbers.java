package day13;

import java.util.HashSet;
import java.util.Set;

public class CommonNumbers {

    /*
    [문제] 두 배열의 공통 숫자 개수 찾기

    두 정수 배열 numbers1과 numbers2가 주어졌을 때,
    두 배열에 모두 존재하는 서로 다른 숫자의 개수를 반환하시오.

    같은 숫자가 여러 번 등장하더라도 한 번만 계산한다.


    예시 1

    입력:
    numbers1 = [1, 2, 2, 3, 4]
    numbers2 = [2, 2, 4, 5]

    출력:
    2

    설명:
    두 배열에 모두 존재하는 서로 다른 숫자는
    2, 4
    총 2개이다.


    예시 2

    입력:
    numbers1 = [1, 3, 5]
    numbers2 = [2, 4, 6]

    출력:
    0
    */

    public static void main(String[] args) {

        int[] numbers1 = {1, 2, 2, 3, 4};
        int[] numbers2 = {2, 2, 4, 5};

        int result = solution(numbers1, numbers2);

        System.out.println(result); // 2
    }

    public static int solution(int[] numbers1, int[] numbers2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int number : numbers1) {
            set1.add(number);
        }

        for (int number : numbers2) {
            if (set1.contains(number)) {
                common.add(number);
            }
        }

        return common.size();
    }
}