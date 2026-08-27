package day14;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    /*
    [문제] 가장 긴 연속 숫자 길이 찾기

    정렬되지 않은 정수 배열 numbers가 주어졌을 때,
    연속된 숫자로 이루어진 가장 긴 구간의 길이를 반환하시오.

    배열에서 숫자들이 실제로 붙어 있을 필요는 없으며,
    값이 1씩 증가하면 연속된 숫자로 본다.

    Arrays.sort()는 사용하지 않는다.


    예시 1

    입력:
    numbers = [100, 4, 200, 1, 3, 2]

    출력:
    4

    설명:
    1, 2, 3, 4가 존재하므로
    가장 긴 연속 숫자의 길이는 4이다.


    예시 2

    입력:
    numbers = [9, 1, 4, 7, 3, 2, 6, 5, 8]

    출력:
    9

    설명:
    1부터 9까지 모두 존재한다.


    예시 3

    입력:
    numbers = [1, 2, 2, 3]

    출력:
    3

    설명:
    중복된 2는 한 번만 생각한다.
    1, 2, 3이 연속되므로 길이는 3이다.
    */

    public static void main(String[] args) {

        int[] numbers = {100, 4, 200, 1, 3, 2};

        int result = solution(numbers);

        System.out.println(result); // 4
    }

    public static int solution(int[] numbers) {

        Set<Integer> set = new HashSet<>();

        // TODO: 직접 구현
        for (int number : numbers) {
            set.add(number);
        }

        int maxLength = 0;

        for (int number : set) {
            if (!set.contains(number - 1)) {
                int current = number;
                int length = 1;
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }
        return  maxLength;
    }
}