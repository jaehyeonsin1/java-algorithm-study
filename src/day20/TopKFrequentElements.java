package day20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    /*
    [문제] 가장 자주 등장한 K개의 숫자 찾기

    정수 배열 numbers와 정수 k가 주어질 때,
    배열에서 가장 자주 등장한 숫자 k개를 배열로 반환하세요.

    정답의 순서는 상관없습니다.
    정답이 하나로 결정되도록 각 숫자의 등장 횟수는 서로 다르게 주어집니다.


    예시 1

    입력:
    numbers = [1, 1, 1, 2, 2, 3]
    k = 2

    출력:
    [1, 2]

    설명:
    1은 3번, 2는 2번 등장하므로 가장 자주 등장한 두 숫자는 1과 2입니다.


    예시 2

    입력:
    numbers = [4, 4, 4, 6, 6, 7, 7, 7, 7]
    k = 1

    출력:
    [7]


    예시 3

    입력:
    numbers = [5]
    k = 1

    출력:
    [5]


    제한 사항

    1 <= numbers.length <= 100,000
    -10,000 <= numbers[i] <= 10,000
    1 <= k <= 서로 다른 숫자의 개수
    각 숫자의 등장 횟수는 서로 다릅니다.
    */

    public static void main(String[] args) {

        int[] numbers = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = solution(numbers, k);

        System.out.println(Arrays.toString(result)); // [1, 2] (순서 무관)
    }

    public static int[] solution(int[] numbers, int k) {

        // TODO: 직접 구현
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : numbers){
            map.put(number, map.getOrDefault(number, 0) +1 );
        }
        int[] result = new int[k];

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> Integer.compare(map.get(b), map.get(a)));

        queue.addAll(map.keySet());

        for(int i = 0; i < k; i++){
            result[i] = queue.poll();
        }

        return result;
    }
}
