package day13;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /*
    [문제] 배열에 중복된 숫자가 있는지 확인하기

    정수 배열 numbers가 주어졌을 때,
    같은 숫자가 두 번 이상 등장하면 true,
    모든 숫자가 서로 다르면 false를 반환하시오.


    예시 1

    입력:
    numbers = [1, 2, 3, 1]

    출력:
    true

    설명:
    숫자 1이 두 번 등장한다.


    예시 2

    입력:
    numbers = [1, 2, 3, 4]

    출력:
    false

    설명:
    모든 숫자가 서로 다르다.


    예시 3

    입력:
    numbers = [5, 5]

    출력:
    true
    */

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 1};

        boolean result = solution(numbers);

        System.out.println(result); // true
    }

    public static boolean solution(int[] numbers) {

        Set<Integer> set = new HashSet<>();

        for (int number : numbers) {

            if (set.contains(number)) {
                return true;
            }

            set.add(number);
        }

        return false;
    }
}