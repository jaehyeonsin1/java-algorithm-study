package day19;

public class MaxNonOverlappingMeetings {

    /*
    [문제] 최대 회의 수 선택하기

    하나의 회의실에서 여러 회의를 진행하려고 합니다.
    각 회의의 시작 시간과 종료 시간이 담긴 2차원 정수 배열 meetings가 주어질 때,
    서로 겹치지 않게 진행할 수 있는 최대 회의 수를 반환하세요.

    어떤 회의가 끝나는 시간과 다음 회의가 시작하는 시간이 같으면
    두 회의를 모두 진행할 수 있습니다.


    예시 1

    입력:
    meetings = [[1, 4], [2, 3], [3, 5], [4, 6], [5, 7]]

    출력:
    3

    설명:
    [2, 3], [3, 5], [5, 7]을 선택하면 총 3개의 회의를 진행할 수 있습니다.


    예시 2

    입력:
    meetings = [[1, 2], [2, 3], [3, 4]]

    출력:
    3


    예시 3

    입력:
    meetings = [[1, 10], [2, 5], [6, 8], [9, 12]]

    출력:
    3

    설명:
    [2, 5], [6, 8], [9, 12]를 선택할 수 있습니다.


    제한 사항

    1 <= meetings.length <= 100,000
    meetings[i].length == 2
    0 <= meetings[i][0] < meetings[i][1] <= 1,000,000
    */

    public static void main(String[] args) {

        int[][] meetings = {
                {1, 4},
                {2, 3},
                {3, 5},
                {4, 6},
                {5, 7}
        };

        int result = solution(meetings);

        System.out.println(result); // 3
    }

    public static int solution(int[][] meetings) {

        // TODO: 직접 구현
        return 0;
    }
}
