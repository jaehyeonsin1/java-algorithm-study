package day09;

public class MinSubarraySum {

    /*
    [문제] 연속된 K개 숫자의 최소 합 구하기

    정수 배열 numbers와 정수 k가 주어졌을 때,
    연속된 k개의 숫자를 선택하여 만들 수 있는
    가장 작은 합을 반환하시오.

    숫자의 순서를 변경할 수 없으며,
    반드시 서로 연속된 숫자여야 한다.


    예시 1

    입력:
    numbers = [4, 2, 1, 7, 3, 2]
    k = 3

    출력:
    7

    설명:

    [4, 2, 1] = 7
    [2, 1, 7] = 10
    [1, 7, 3] = 11
    [7, 3, 2] = 12

    따라서 최소 합은 7이다.


    예시 2

    입력:
    numbers = [5, 1, 2, 1, 4]
    k = 2

    출력:
    3

    설명:
    [1, 2] 또는 [2, 1]의 합이 3으로 가장 작다.
    */

    public static void main(String[] args) {
        int[] numbers = {4, 2, 1, 7, 3, 2};
        int k = 3;

        int result = solution(numbers, k);

        System.out.println(result); // 7
    }

    public static int solution(int[] numbers, int k) {

        // TODO: 직접 구현
        /*
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i <= numbers.length - k; i++){
            int sum = 0;
            for(int j = 0; j < k; j++){
                sum += numbers[i + j];
            }
            if(sum < minSum){
                minSum = sum;
            }
        }

        return minSum;
         */
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum += numbers[i];
        }

        int minSum = sum;

        for(int i = k; i < numbers.length; i++){
            sum = sum - numbers[i - k] + numbers[i];

            if(sum < minSum){
                minSum = sum;
            }
        }
        return minSum;
    }
}