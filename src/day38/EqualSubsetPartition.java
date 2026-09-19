package day38;

public class EqualSubsetPartition {

    /*
    [동적 계획법] 같은 합의 두 부분집합으로 나누기

    양의 정수가 담긴 배열 numbers가 주어집니다.
    배열의 모든 숫자를 빠짐없이 두 부분집합으로 나누었을 때,
    두 부분집합의 합을 같게 만들 수 있으면 true를 반환하세요.

    같게 만들 수 없다면 false를 반환하세요.
    각 숫자는 한 번만 사용할 수 있습니다.


    예시 1

    입력:
    numbers = [1, 5, 11, 5]

    출력:
    true

    설명:
    [1, 5, 5]와 [11]로 나누면 두 부분집합의 합이 모두 11입니다.


    예시 2

    입력:
    numbers = [1, 2, 3, 5]

    출력:
    false

    설명:
    두 부분집합의 합을 같게 나눌 수 없습니다.


    예시 3

    입력:
    numbers = [1, 1]

    출력:
    true

    설명:
    [1]과 [1]로 나눌 수 있습니다.


    제한 사항

    1 <= numbers.length <= 200
    1 <= numbers[i] <= 100
    */

    public static void main(String[] args) {

        int[] numbers = {1, 5, 11, 5};

        boolean result = solution(numbers);

        System.out.println(result); // true
    }

    public static boolean solution(int[] numbers) {

        // TODO: 직접 구현
        return false;
    }
}
