package day22;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestNumbers {

    /*
    [문제] 목표값에 가장 가까운 K개의 숫자 찾기

    정수 배열 numbers, 정수 target, 정수 k가 주어집니다.
    target과의 차이가 가장 작은 숫자 k개를 배열로 반환하세요.

    두 숫자의 차이가 같다면 더 작은 숫자를 우선으로 선택합니다.
    반환하는 숫자의 순서는 상관없습니다.


    예시 1

    입력:
    numbers = [1, 2, 3, 4, 5]
    target = 3
    k = 2

    출력:
    [3, 2]

    설명:
    3은 target과의 차이가 0이고,
    2와 4는 차이가 1이지만 더 작은 2를 우선으로 선택합니다.


    예시 2

    입력:
    numbers = [10, 2, 14, 4, 7, 6]
    target = 5
    k = 3

    출력:
    [4, 6, 7]


    예시 3

    입력:
    numbers = [8]
    target = 3
    k = 1

    출력:
    [8]


    제한 사항

    1 <= numbers.length <= 100,000
    -100,000 <= numbers[i], target <= 100,000
    1 <= k <= numbers.length
    numbers의 원소는 서로 다릅니다.
    */

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int target = 3;
        int k = 2;

        int[] result = solution(numbers, target, k);

        System.out.println(Arrays.toString(result)); // [3, 2] (순서 무관)
    }

    public static int[] solution(int[] numbers, int target, int k) {

        // TODO: 직접 구현
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            int diffA = Math.abs(a - target);
            int diffB = Math.abs(b - target);
            if(diffA != diffB){
                return Integer.compare(diffB, diffA);
            }

            return Integer.compare(b, a);
        });

        for(int number : numbers){
            queue.offer(number);

            if(queue.size() > k){
                queue.poll();
            }
        }



        return queue.stream().mapToInt(Integer::intValue).toArray();
    }
}
