package day21;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {

    /*
    [문제] 마지막 돌의 무게 구하기

    돌들의 무게가 담긴 정수 배열 stones가 주어집니다.
    매번 가장 무거운 돌 두 개를 골라 서로 부딪힙니다.

    두 돌의 무게가 같으면 두 돌 모두 사라집니다.
    두 돌의 무게가 다르면 무거운 돌에서 가벼운 돌의 무게를 뺀
    새로운 돌 하나가 남습니다.

    돌이 하나 이하로 남을 때까지 이 과정을 반복한 뒤,
    마지막 돌의 무게를 반환하세요.
    모든 돌이 사라지면 0을 반환하세요.


    예시 1

    입력:
    stones = [2, 7, 4, 1, 8, 1]

    출력:
    1

    설명:
    8과 7을 부딪히면 1이 남습니다.
    4와 2를 부딪히면 2가 남습니다.
    2와 1을 부딪히면 1이 남습니다.
    1과 1을 부딪히면 모두 사라지고 마지막 돌의 무게는 1입니다.


    예시 2

    입력:
    stones = [1]

    출력:
    1


    예시 3

    입력:
    stones = [3, 3]

    출력:
    0


    제한 사항

    1 <= stones.length <= 100,000
    1 <= stones[i] <= 10,000
    */

    public static void main(String[] args) {

        int[] stones = {2, 7, 4, 1, 8, 1};

        int result = solution(stones);

        System.out.println(result); // 1
    }

    public static int solution(int[] stones) {

        // TODO: 직접 구현
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for(int stone : stones){
            queue.offer(stone);
        }

        while(queue.size() > 1){
            int a = queue.remove();
            int b = queue.remove();

            int remainingWeight = a - b;

            if(remainingWeight != 0){
                queue.offer(remainingWeight);
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }
}
