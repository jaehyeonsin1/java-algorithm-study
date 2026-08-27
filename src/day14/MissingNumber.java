package day14;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    /*
    [문제] 빠진 숫자 찾기

    0부터 n까지의 숫자 중 하나가 빠진 배열 numbers가 주어진다.

    배열의 길이가 n일 때,
    0부터 n까지 총 n + 1개의 숫자 중
    배열에 존재하지 않는 숫자 하나를 반환하시오.

    숫자의 순서는 정렬되어 있지 않을 수 있다.


    예시 1

    입력:
    numbers = [3, 0, 1]

    출력:
    2


    예시 2

    입력:
    numbers = [0, 1]

    출력:
    2


    예시 3

    입력:
    numbers = [9, 6, 4, 2, 3, 5, 7, 0, 1]

    출력:
    8
    */

    public static void main(String[] args) {

        int[] numbers = {3, 0, 1};

        int result = solution(numbers);

        System.out.println(result); // 2
    }

    public static int solution(int[] numbers) {

        Set<Integer> set = new HashSet<>();

        // TODO: 직접 구현
        for(int number : numbers){
            set.add(number);
        }
        for (int i = 0; i <= numbers.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}