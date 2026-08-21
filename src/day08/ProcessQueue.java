package day08;

import java.util.ArrayDeque;
import java.util.Deque;

public class ProcessQueue {

    /*
    [문제] 제한된 작업 처리하기

    처리해야 할 작업 번호가 담긴 배열 tasks와
    한 번에 처리할 수 있는 작업 개수 limit가 주어진다.

    작업을 앞에서부터 Queue에 넣은 뒤,
    Queue에서 먼저 들어온 작업부터 limit개만 처리한다.

    처리한 작업 번호의 합을 반환하시오.


    예시 1

    입력:
    tasks = [10, 20, 30, 40, 50]
    limit = 3

    처리:
    10
    20
    30

    출력:
    60


    예시 2

    입력:
    tasks = [5, 10, 15, 20]
    limit = 2

    처리:
    5
    10

    출력:
    15
    */

    public static void main(String[] args) {
        int[] tasks = {10, 20, 30, 40, 50};
        int limit = 3;

        int result = solution(tasks, limit);

        System.out.println(result); // 60
    }

    public static int solution(int[] tasks, int limit) {

        Deque<Integer> queue = new ArrayDeque<>();

        // TODO: 직접 구현
        int sum = 0;

        for(int task : tasks) {
            queue.offer(task);
        }
        while(limit-- > 0 && !queue.isEmpty()) {
            sum += queue.poll();
        }

        return sum;
    }
}