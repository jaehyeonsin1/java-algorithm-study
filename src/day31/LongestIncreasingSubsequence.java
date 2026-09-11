package day31;

public class LongestIncreasingSubsequence {

    /*
    [동적 계획법/이진 탐색] 가장 긴 증가하는 부분 수열

    정수 배열 numbers가 주어집니다.
    배열에서 일부 숫자를 순서대로 선택했을 때, 선택한 숫자가
    계속 증가하는 가장 긴 부분 수열의 길이를 반환하세요.

    부분 수열은 원래 배열의 순서를 유지해야 하지만,
    연속된 숫자를 선택할 필요는 없습니다.


    예시 1

    입력:
    numbers = [10, 9, 2, 5, 3, 7, 101, 18]

    출력:
    4

    설명:
    [2, 3, 7, 101]과 같은 길이 4의 증가하는 부분 수열을
    만들 수 있습니다.


    예시 2

    입력:
    numbers = [0, 1, 0, 3, 2, 3]

    출력:
    4

    설명:
    [0, 1, 2, 3]을 선택할 수 있습니다.


    예시 3

    입력:
    numbers = [7, 7, 7, 7]

    출력:
    1


    제한 사항

    1 <= numbers.length <= 100,000
    -1,000,000,000 <= numbers[i] <= 1,000,000,000
    */

    public static void main(String[] args) {

        int[] numbers = {10, 9, 2, 5, 3, 7, 101, 18};

        int result = solution(numbers);

        System.out.println(result); // 4
    }

    public static int solution(int[] numbers) {

        int[] smallestTail = new int[numbers.length];
        int length = 0;

        for (int number : numbers) {
            int position = lowerBound(smallestTail, length, number);
            smallestTail[position] = number;

            if (position == length) {
                length++;
            }
        }

        return length;
    }

    private static int lowerBound(int[] numbers, int length, int target) {

        int left = 0;
        int right = length;

        while (left < right) {
            int middle = left + (right - left) / 2;

            if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }

        return left;
    }
}
