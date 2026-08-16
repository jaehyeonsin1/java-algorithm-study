package day05;

public class MaxDifference {

    /*
    [문제] 배열의 최댓값과 최솟값 차이 구하기

    정수 배열 numbers가 주어졌을 때,
    배열에서 가장 큰 값과 가장 작은 값을 찾아
    두 값의 차이를 반환하시오.

    Arrays.sort()는 사용하지 않는다.

    예시 1

    입력:
    [5, 3, 8, 1, 7]

    출력:
    7

    설명:
    최댓값 = 8
    최솟값 = 1
    차이 = 8 - 1 = 7


    예시 2

    입력:
    [-5, -2, -10, -1]

    출력:
    9

    설명:
    최댓값 = -1
    최솟값 = -10
    차이 = -1 - (-10) = 9
    */

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 7};

        int result = solution(numbers);

        System.out.println(result); // 7
    }

    public static int solution(int[] numbers) {

        // TODO: 직접 구현
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int number : numbers){
            if(number > max){
                max = number;
            }if(number < min){
                min = number;
            }
        }

        return max - min;
    }
}