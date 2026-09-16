package day35;

public class MinimumOperationsToOne {

    /*
    [동적 계획법] 1로 만드는 최소 연산 횟수

    양의 정수 n이 주어집니다.
    다음 세 가지 연산을 사용해서 n을 1로 만들려고 합니다.

    1. 현재 숫자에서 1을 뺍니다.
    2. 현재 숫자가 2로 나누어떨어지면 2로 나눕니다.
    3. 현재 숫자가 3으로 나누어떨어지면 3으로 나눕니다.

    n을 1로 만드는 데 필요한 최소 연산 횟수를 반환하세요.


    예시 1

    입력:
    n = 10

    출력:
    3

    설명:
    10 -> 9 -> 3 -> 1 순서로 세 번 연산하면 됩니다.


    예시 2

    입력:
    n = 6

    출력:
    2

    설명:
    6 -> 3 -> 1 순서로 두 번 연산하면 됩니다.


    예시 3

    입력:
    n = 1

    출력:
    0

    설명:
    이미 1이므로 연산이 필요하지 않습니다.


    제한 사항

    1 <= n <= 1,000,000
    */

    public static void main(String[] args) {

        int n = 10;

        int result = solution(n);

        System.out.println(result); // 3
    }

    public static int solution(int n) {

        // TODO: 직접 구현
        return -1;
    }
}
