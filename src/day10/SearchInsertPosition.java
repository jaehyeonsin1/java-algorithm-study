package day10;

public class SearchInsertPosition {

    /*
    [문제] 숫자가 들어갈 위치 찾기

    오름차순으로 정렬된 정수 배열 numbers와
    찾고 싶은 숫자 target이 주어졌을 때,

    target이 배열에 존재하면 해당 인덱스를 반환하고,
    존재하지 않으면 오름차순을 유지하기 위해
    target이 들어가야 할 인덱스를 반환하시오.

    시간복잡도는 O(log n)이어야 한다.


    예시 1

    입력:
    numbers = [1, 3, 5, 7]
    target = 5

    출력:
    2


    예시 2

    입력:
    numbers = [1, 3, 5, 7]
    target = 4

    출력:
    2

    설명:
    4가 인덱스 2에 들어가면
    [1, 3, 4, 5, 7]로 오름차순이 유지된다.


    예시 3

    입력:
    numbers = [1, 3, 5, 7]
    target = 8

    출력:
    4


    예시 4

    입력:
    numbers = [1, 3, 5, 7]
    target = 0

    출력:
    0
    */

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7};
        int target = 4;

        int result = solution(numbers, target);

        System.out.println(result); // 2
    }

    public static int solution(int[] numbers, int target) {

        // TODO: 이진 탐색으로 구현
        int left = 0;
        int right = numbers.length - 1;

        while(left <= right){
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

        return left;
    }
}