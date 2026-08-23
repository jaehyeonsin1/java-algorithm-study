package day10;

public class FirstOccurrence {

    /*
    [문제] 중복된 숫자의 첫 번째 위치 찾기

    오름차순으로 정렬된 정수 배열 numbers와
    찾고 싶은 숫자 target이 주어졌을 때,

    target이 여러 개 존재하면 가장 첫 번째 인덱스를 반환하고,
    target이 존재하지 않으면 -1을 반환하시오.

    시간복잡도는 O(log n)이어야 한다.


    예시 1

    입력:
    numbers = [1, 2, 2, 2, 3, 4]
    target = 2

    출력:
    1


    예시 2

    입력:
    numbers = [1, 1, 1, 3, 5]
    target = 1

    출력:
    0


    예시 3

    입력:
    numbers = [1, 2, 3, 4, 5]
    target = 6

    출력:
    -1
    */

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 2, 3, 4};
        int target = 2;

        int result = solution(numbers, target);

        System.out.println(result); // 1
    }

    public static int solution(int[] numbers, int target) {

        // TODO: 이진 탐색으로 첫 번째 위치 찾기
        int left = 0;
        int right = numbers.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(numbers[mid] == target){
                if(mid == 0 || numbers[mid - 1] != target){
                    return mid;
                }else {
                    right = mid - 1;
                }
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