    package day12;

    import java.util.HashMap;
    import java.util.Map;

    public class SubarraySumCount {

        /*
        [문제] 합이 target인 연속 부분 배열 개수 찾기

        정수 배열 numbers와 정수 target이 주어졌을 때,
        연속된 숫자들의 합이 target이 되는
        구간의 개수를 반환하시오.

        HashMap과 누적 합을 활용하여
        O(N) 시간복잡도로 구현하시오.


        예시 1

        입력:
        numbers = [1, 2, 1, 2, 1]
        target = 3

        출력:
        4

        설명:

        [1, 2]
           [2, 1]
              [1, 2]
                 [2, 1]

        총 4개이다.


        예시 2

        입력:
        numbers = [1, 1, 1]
        target = 2

        출력:
        2

        설명:

        [1, 1]
           [1, 1]

        총 2개이다.


        예시 3

        입력:
        numbers = [3, -1, 1, 2]
        target = 3

        출력:
        3
        */

        public static void main(String[] args) {

            int[] numbers = {1, 2, 1, 2, 1};
            int target = 3;

            int result = solution(numbers, target);

            System.out.println(result); // 4
        }

        public static int solution(int[] numbers, int target) {

            Map<Integer, Integer> map = new HashMap<>();

            // TODO: 직접 구현
            map.put(0, 1);
            int sum = 0;
            int count = 0;

            for (int number : numbers) {
                sum += number;
                int need = sum - target;
                if (map.containsKey(need)) {
                    count += map.get(need);
                }
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }

            return count;
        }
    }