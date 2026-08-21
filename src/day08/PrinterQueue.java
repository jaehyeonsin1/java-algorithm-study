package day08;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrinterQueue {

    /*
    [문제] 프린터 대기열 처리하기

    출력 대기 중인 문서 번호가 배열 documents에 담겨 있다.

    프린터는 Queue의 앞에서부터 문서를 하나씩 출력한다.

    단, 문서 번호가 target인 문서가 출력될 때까지
    총 몇 개의 문서가 출력되는지 반환하시오.

    target 문서는 반드시 documents 안에 존재한다.


    예시 1

    입력:
    documents = [10, 20, 30, 40, 50]
    target = 30

    출력:
    3

    설명:
    10 출력 → 1개
    20 출력 → 2개
    30 출력 → 3개

    따라서 3을 반환한다.


    예시 2

    입력:
    documents = [5, 8, 2, 9]
    target = 9

    출력:
    4
    */

    public static void main(String[] args) {
        int[] documents = {10, 20, 30, 40, 50};
        int target = 30;

        int result = solution(documents, target);

        System.out.println(result); // 3
    }

    public static int solution(int[] documents, int target) {

        Deque<Integer> queue = new ArrayDeque<>();

        // TODO: 직접 구현
        int count = 0;

        for(int document : documents) {
            queue.offer(document);
        }
        while(!queue.isEmpty()) {
            int document = queue.poll();
            count++;
            if(document == target) {
                break;
            }
        }

        return count;
    }
}