package day27;

public class TargetNumber {

    /*
    [DFS] 타겟 넘버

    음이 아닌 정수가 담긴 배열 numbers와 정수 target이 주어집니다.
    각 숫자의 순서는 바꾸지 않고, 모든 숫자 앞에 + 또는 -를 붙여
    계산 결과가 target이 되도록 만드는 방법의 수를 반환하세요.


    예시 1

    입력:
    numbers = [1, 1, 1, 1, 1]
    target = 3

    출력:
    5

    설명:
    다음과 같은 다섯 가지 방법이 있습니다.

    -1 +1 +1 +1 +1 = 3
    +1 -1 +1 +1 +1 = 3
    +1 +1 -1 +1 +1 = 3
    +1 +1 +1 -1 +1 = 3
    +1 +1 +1 +1 -1 = 3


    예시 2

    입력:
    numbers = [4, 1, 2, 1]
    target = 4

    출력:
    2


    제한 사항

    2 <= numbers.length <= 20
    1 <= numbers[i] <= 50
    -1,000 <= target <= 1,000
    정답은 int 범위 안에 있습니다.
    */

    public static void main(String[] args) {

        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        int result = solution(numbers, target);

        System.out.println(result); // 5
    }

    public static int solution(int[] numbers, int target) {

        return countWays(numbers, target, 0, 0);
    }

    private static int countWays(int[] numbers, int target, int index, int sum) {

        if (index == numbers.length) {
            return sum == target ? 1 : 0;
        }

        int plusCount = countWays(
                numbers,
                target,
                index + 1,
                sum + numbers[index]
        );

        int minusCount = countWays(
                numbers,
                target,
                index + 1,
                sum - numbers[index]
        );

        return plusCount + minusCount;
    }
}
