package day17;

public class LongestOnesAfterFlips {

    /*
    [문제] 0을 뒤집어 만들 수 있는 가장 긴 연속된 1

    0과 1로만 이루어진 정수 배열 numbers와 정수 k가 주어집니다.
    배열에서 최대 k개의 0을 1로 바꿀 수 있을 때,
    만들 수 있는 가장 긴 연속된 1의 길이를 반환하세요.


    예시 1

    입력:
    numbers = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0]
    k = 2

    출력:
    6

    설명:
    0 두 개를 1로 바꾸면 길이가 6인 연속 구간을 만들 수 있습니다.


    예시 2

    입력:
    numbers = [0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0]
    k = 3

    출력:
    10


    예시 3

    입력:
    numbers = [1, 1, 1]
    k = 0

    출력:
    3


    제한 사항

    1 <= numbers.length <= 100,000
    numbers의 각 원소는 0 또는 1입니다.
    0 <= k <= numbers.length
    */

    public static void main(String[] args) {

        int[] numbers = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        int result = solution(numbers, k);

        System.out.println(result); // 6
    }

    public static int solution(int[] numbers, int k) {

        // TODO: 직접 구현
        return 0;
    }
}
