package day20;

public class KthLargestElement {

    /*
    [문제] K번째로 큰 수 찾기

    정수 배열 numbers와 정수 k가 주어질 때,
    배열에서 k번째로 큰 수를 반환하세요.

    k번째로 큰 수는 서로 다른 수만 세었을 때의 순위가 아니라,
    배열의 모든 원소를 큰 순서대로 나열했을 때의 k번째 원소입니다.


    예시 1

    입력:
    numbers = [3, 2, 1, 5, 6, 4]
    k = 2

    출력:
    5

    설명:
    큰 순서대로 나열하면 [6, 5, 4, 3, 2, 1]이므로 두 번째로 큰 수는 5입니다.


    예시 2

    입력:
    numbers = [3, 2, 3, 1, 2, 4, 5, 5, 6]
    k = 4

    출력:
    4

    설명:
    큰 순서대로 나열하면 [6, 5, 5, 4, 3, 3, 2, 2, 1]입니다.
    중복된 값도 각각 하나의 원소로 셉니다.


    예시 3

    입력:
    numbers = [7]
    k = 1

    출력:
    7


    제한 사항

    1 <= numbers.length <= 100,000
    -10,000 <= numbers[i] <= 10,000
    1 <= k <= numbers.length
    */

    public static void main(String[] args) {

        int[] numbers = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = solution(numbers, k);

        System.out.println(result); // 5
    }

    public static int solution(int[] numbers, int k) {

        // TODO: 직접 구현
        return 0;
    }
}
