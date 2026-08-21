package day08;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueuePractice {

    /*
    [문제] 대기열 처리하기

    정수 배열 customers가 주어졌을 때,
    배열의 앞에서부터 고객을 대기열에 넣고,
    다시 대기열의 앞에서부터 한 명씩 꺼내
    꺼낸 순서대로 출력하시오.

    Queue의 FIFO 구조를 확인하기 위한 문제이다.

    예시

    입력:
    [10, 20, 30, 40]

    출력:
    10
    20
    30
    40

    설명:
    먼저 들어간 값이 먼저 나온다.
    */

    public static void main(String[] args) {
        int[] customers = {10, 20, 30, 40};

        solution(customers);
    }

    public static void solution(int[] customers) {

        Deque<Integer> queue = new ArrayDeque<>();

        // TODO: 직접 구현
        for(int customer : customers){
            queue.offer(customer);
        }
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}