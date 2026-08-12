package day02;

import java.util.Arrays;

public class FindMax {
    /*
    [문제] 배열에서 최댓값 찾기
    정수 배열 numbers가 주어졌을 때,
    배열에 들어있는 숫자 중 가장 큰 값을 찾아 반환하시오.
     */
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4};

        int result = solution(numbers);

        System.out.println(result); //9
    }

    private static int solution(int[] numbers) {

        //TODO: 직접구현
        int max = numbers[0];
        for(int i =0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;

        //return Arrays.stream(numbers).max().orElse(0);
    }
}
