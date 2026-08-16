package day05;

public class SecondLargest {

    /*
    [문제] 두 번째로 큰 숫자 찾기

    정수 배열 numbers가 주어졌을 때,
    배열에서 두 번째로 큰 서로 다른 숫자를 반환하시오.

    Arrays.sort()는 사용하지 않는다.

    예시 1

    입력:
    [5, 3, 8, 1, 7]

    출력:
    7


    예시 2

    입력:
    [10, 5, 10, 8, 3]

    출력:
    8

    설명:
    가장 큰 숫자는 10이고,
    두 번째로 큰 서로 다른 숫자는 8이다.
    */

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 7};

        int result = solution(numbers);

        System.out.println(result); // 7
    }

    public static int solution(int[] numbers) {

        // TODO: 직접 구현
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int number : numbers){
            if(number > max){
                secondMax = max;
                max = number;
            }else if(number < max && number > secondMax){
                secondMax = number;
            }
        }


        return secondMax;
    }
}