package day21;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumRopeConnectionCost {

    /*
    [문제] 밧줄을 연결하는 최소 비용 구하기

    여러 밧줄의 길이가 담긴 정수 배열 ropes가 주어집니다.
    두 밧줄을 연결하는 비용은 두 밧줄 길이의 합입니다.

    연결한 밧줄은 하나의 새로운 밧줄이 되며,
    모든 밧줄을 하나로 연결할 때 필요한 최소 비용을 반환하세요.


    예시 1

    입력:
    ropes = [4, 3, 2, 6]

    출력:
    29

    설명:
    길이 2와 3을 연결하면 비용은 5입니다.
    길이 4와 5를 연결하면 비용은 9입니다.
    길이 6과 9를 연결하면 비용은 15입니다.
    총비용은 5 + 9 + 15 = 29입니다.


    예시 2

    입력:
    ropes = [1, 2, 3, 4, 5]

    출력:
    33


    예시 3

    입력:
    ropes = [10]

    출력:
    0

    설명:
    밧줄이 하나뿐이면 연결할 필요가 없습니다.


    제한 사항

    1 <= ropes.length <= 100,000
    1 <= ropes[i] <= 10,000
    정답은 int 범위를 넘지 않습니다.
    */

    public static void main(String[] args) {

        int[] ropes = {4, 3, 2, 6};

        int result = solution(ropes);

        System.out.println(result); // 29
    }

    public static int solution(int[] ropes) {

        // TODO: 직접 구현
        Arrays.sort(ropes);
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int maxPrice = 0;

        if(ropes.length == 1){
            return 0;
        }else {
            for(int rope : ropes){
                queue.offer(rope);
            }
        }

        while(queue.size() > 1){
            int a = queue.poll();
            int b = queue.poll();

            int connected = a + b;
            maxPrice += connected;
            queue.offer(connected);
        }

        return maxPrice;
    }
}
