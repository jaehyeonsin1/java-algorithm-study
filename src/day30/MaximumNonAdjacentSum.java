package day30;

public class MaximumNonAdjacentSum {

    /*
    [동적 계획법] 인접하지 않은 숫자의 최대 합

    음이 아닌 정수가 담긴 배열 numbers가 주어집니다.
    서로 인접한 숫자를 동시에 선택하지 않으면서 만들 수 있는
    가장 큰 합을 반환하세요.


    예시 1

    입력:
    numbers = [2, 7, 9, 3, 1]

    출력:
    12

    설명:
    2, 9, 1을 선택하면 합이 12로 가장 큽니다.


    예시 2

    입력:
    numbers = [2, 1, 1, 2]

    출력:
    4

    설명:
    첫 번째 2와 마지막 2를 선택하면 됩니다.


    예시 3

    입력:
    numbers = [5]

    출력:
    5


    제한 사항

    1 <= numbers.length <= 100,000
    0 <= numbers[i] <= 10,000
    정답은 int 범위 안에 있습니다.
    */

    public static void main(String[] args) {

        int[] numbers = {2, 7, 9, 3, 1};

        int result = solution(numbers);

        System.out.println(result); // 12
    }

    public static int solution(int[] numbers) {

        int maximumUntilPrevious = 0;
        int maximumUntilCurrent = 0;

        for (int number : numbers) {
            int selectCurrent = maximumUntilPrevious + number;
            int skipCurrent = maximumUntilCurrent;

            maximumUntilPrevious = maximumUntilCurrent;
            maximumUntilCurrent = Math.max(selectCurrent, skipCurrent);
        }

        return maximumUntilCurrent;
    }
}
