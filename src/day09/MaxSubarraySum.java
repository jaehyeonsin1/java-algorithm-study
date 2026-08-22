package day09;

public class MaxSubarraySum {

    /*
    [문제] 연속된 K개 숫자의 최대 합 구하기

    정수 배열 numbers와 정수 k가 주어졌을 때,
    연속된 k개의 숫자를 선택하여 만들 수 있는
    가장 큰 합을 반환하시오.

    숫자의 순서를 변경할 수 없으며,
    반드시 서로 연속된 숫자여야 한다.


    예시 1

    입력:
    numbers = [2, 1, 5, 1, 3, 2]
    k = 3

    출력:
    9

    설명:

    연속된 3개씩 확인하면

    [2, 1, 5] = 8
    [1, 5, 1] = 7
    [5, 1, 3] = 9
    [1, 3, 2] = 6

    따라서 최대 합은 9이다.


    예시 2

    입력:
    numbers = [4, 2, 1, 7, 8, 1, 2]
    k = 2

    출력:
    15

    설명:

    [7, 8] = 15가 가장 크다.
    */

    public static void main(String[] args) {
        int[] numbers = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = solution(numbers, k);

        System.out.println(result); // 9
    }

    public static int solution(int[] numbers, int k) {

        // TODO: 직접 구현
        int maxSum = 0;
        for(int i = 0; i < numbers.length - k; i++){
            int sum = 0;
            for(int j = 0; j < k; j++){
                sum += numbers[i + j];
            }
            if(sum > maxSum){
                maxSum = sum;
            }
        }

        return maxSum;
    }
}