package day06;

public class RemoveDuplicates {

    /*
    [문제] 정렬된 배열에서 중복 제거하기

    오름차순으로 정렬된 정수 배열 numbers가 주어졌을 때,
    중복을 제거한 서로 다른 숫자의 개수를 반환하시오.

    추가 배열이나 Set은 사용하지 않는다.

    예시 1

    입력:
    [1, 1, 2, 2, 3, 4, 4]

    출력:
    4

    설명:
    서로 다른 숫자는
    1, 2, 3, 4
    총 4개이다.


    예시 2

    입력:
    [1, 1, 1, 1]

    출력:
    1
    */

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 3, 4, 4};

        int result = solution(numbers);

        System.out.println(result); // 4
    }

    public static int solution(int[] numbers) {

        // TODO: 직접 구현

        if(numbers == null || numbers.length == 0){
            return 0;
        }

        int count = 1;

        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] != numbers[i+1]){
                count++;
            }
        }

        return count;
    }
}