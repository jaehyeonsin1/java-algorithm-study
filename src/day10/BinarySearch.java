package day10;

public class BinarySearch {

    /*
    [문제] 이진 탐색으로 숫자 찾기

    오름차순으로 정렬된 정수 배열 numbers와
    찾고 싶은 숫자 target이 주어졌을 때,

    target이 배열에 존재하면 해당 인덱스를 반환하고,
    존재하지 않으면 -1을 반환하시오.

    Arrays.binarySearch()는 사용하지 않는다.


    예시 1

    입력:
    numbers = [1, 3, 5, 7, 9, 11, 13]
    target = 9

    출력:
    4


    예시 2

    입력:
    numbers = [1, 3, 5, 7, 9, 11, 13]
    target = 6

    출력:
    -1
    */

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 13};
        int target = 9;

        int result = solution(numbers, target);

        System.out.println(result); // 4
    }

    public static int solution(int[] numbers, int target) {

        // TODO: 직접 구현
        int left = 0;
        int right = numbers.length - 1;

        while(left <= right ){
            int mid = left + (right - left) / 2;

            if(numbers[mid] == target){
                return mid;
            }

            if(numbers[mid] < target){
                left = mid + 1;
            }
            if(numbers[mid] > target){
                right = mid - 1;
            }
        }

        return -1;
    }
}