package day06;

public class TwoPointerSum {

    /*
    [문제] 정렬된 배열에서 두 수의 합 찾기

    오름차순으로 정렬된 정수 배열 numbers와
    정수 target이 주어졌을 때,

    서로 다른 두 숫자의 합이 target이 되는 경우
    true를 반환하고,
    존재하지 않으면 false를 반환하시오.

    배열은 이미 오름차순으로 정렬되어 있다.


    예시 1

    입력:
    numbers = [1, 2, 4, 6, 8, 9]
    target = 10

    출력:
    true

    설명:
    2 + 8 = 10


    예시 2

    입력:
    numbers = [1, 2, 4, 6, 8, 9]
    target = 20

    출력:
    false
    */

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 8, 9};
        int target = 10;

        boolean result = solution(numbers, target);

        System.out.println(result); // true
    }

    public static boolean solution(int[] numbers, int target) {

        // TODO: 직접 구현
        int left = 0;
        int right = numbers.length-1;
        while (left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return true;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }

        return false;
    }
}