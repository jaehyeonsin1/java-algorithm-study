package day05;

public class BubbleSort {

    /*
    [문제] 버블 정렬 구현하기

    정수 배열 numbers가 주어졌을 때,
    배열의 숫자를 오름차순으로 정렬하여 반환하시오.

    Arrays.sort()는 사용하지 않는다.

    예시 1

    입력:
    [5, 3, 8, 1, 2]

    출력:
    [1, 2, 3, 5, 8]


    예시 2

    입력:
    [4, 2, 7, 2, 1]

    출력:
    [1, 2, 2, 4, 7]
    */

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};

        int[] result = solution(numbers);

        for (int number : result) {
            System.out.print(number + " ");
        }
        // 1 2 3 5 8
    }

    public static int[] solution(int[] numbers) {

        // TODO: 직접 구현
        for (int i = 0; i < numbers.length - 1; i++) {
            for(int j = 0; j < numbers.length - 1 - i; j++) {
                if(numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        return numbers;
    }
}