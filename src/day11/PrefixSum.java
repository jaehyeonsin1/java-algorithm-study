package day11;

public class PrefixSum {

    /*
    [문제] 구간 합 구하기

    정수 배열 numbers와 두 인덱스 start, end가 주어졌을 때,
    start부터 end까지의 합을 반환하시오.

    누적 합(Prefix Sum)을 사용하여 구현하시오.

    예시

    numbers = [2, 4, 1, 5, 3]
    start = 1
    end = 3

    출력:
    10

    설명:
    4 + 1 + 5 = 10
    */

    public static void main(String[] args) {
        int[] numbers = {2, 4, 1, 5, 3};

        int result = solution(numbers, 1, 3);

        System.out.println(result); // 10
    }

    public static int solution(int[] numbers, int start, int end) {

        int[] prefix = new int[numbers.length + 1];

        for (int i = 0; i < numbers.length; i++) {
            prefix[i + 1] = prefix[i] + numbers[i];
        }

        return prefix[end + 1] - prefix[start];
    }
}