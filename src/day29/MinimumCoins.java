package day29;

import java.util.Arrays;

public class MinimumCoins {

    /*
    [동적 계획법] 최소 동전 개수

    서로 다른 종류의 동전 금액이 담긴 배열 coins와 목표 금액 amount가
    주어집니다. 각 동전은 원하는 만큼 사용할 수 있습니다.

    amount를 만들기 위해 필요한 최소 동전 개수를 반환하세요.
    amount를 만들 수 없다면 -1을 반환하세요.


    예시 1

    입력:
    coins = [1, 2, 5]
    amount = 11

    출력:
    3

    설명:
    5원 동전 2개와 1원 동전 1개로 11원을 만들 수 있습니다.


    예시 2

    입력:
    coins = [2]
    amount = 3

    출력:
    -1


    예시 3

    입력:
    coins = [2, 3, 7]
    amount = 0

    출력:
    0


    제한 사항

    1 <= coins.length <= 20
    1 <= coins[i] <= 10,000
    coins의 모든 값은 서로 다릅니다.
    0 <= amount <= 10,000
    */

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 11;

        int result = solution(coins, amount);

        System.out.println(result); // 3
    }

    public static int solution(int[] coins, int amount) {

        int unreachable = amount + 1;
        int[] minimumCoins = new int[amount + 1];
        Arrays.fill(minimumCoins, unreachable);
        minimumCoins[0] = 0;

        for (int currentAmount = 1; currentAmount <= amount; currentAmount++) {
            for (int coin : coins) {
                if (coin > currentAmount) {
                    continue;
                }

                minimumCoins[currentAmount] = Math.min(
                        minimumCoins[currentAmount],
                        minimumCoins[currentAmount - coin] + 1
                );
            }
        }

        return minimumCoins[amount] == unreachable
                ? -1
                : minimumCoins[amount];
    }
}
