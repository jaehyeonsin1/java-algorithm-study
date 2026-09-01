package day19;

import java.util.Arrays;

public class MinimumMeetingRooms {

    /*
    [문제] 필요한 최소 회의실 수 구하기

    여러 회의의 시작 시간과 종료 시간이 담긴 2차원 정수 배열 meetings가 주어집니다.
    모든 회의를 빠짐없이 진행하기 위해 필요한 최소 회의실 수를 반환하세요.

    어떤 회의가 끝나는 시간과 다른 회의가 시작하는 시간이 같으면
    같은 회의실을 이어서 사용할 수 있습니다.


    예시 1

    입력:
    meetings = [[0, 30], [5, 10], [15, 20]]

    출력:
    2

    설명:
    [0, 30] 회의가 진행되는 동안 [5, 10] 또는 [15, 20] 회의가 겹치므로
    최소 2개의 회의실이 필요합니다.


    예시 2

    입력:
    meetings = [[7, 10], [2, 4]]

    출력:
    1


    예시 3

    입력:
    meetings = [[1, 5], [2, 6], [3, 7], [8, 10]]

    출력:
    3


    제한 사항

    1 <= meetings.length <= 100,000
    meetings[i].length == 2
    0 <= meetings[i][0] < meetings[i][1] <= 1,000,000
    */

    public static void main(String[] args) {

        int[][] meetings = {
                {0, 30},
                {5, 10},
                {15, 20}
        };

        int result = solution(meetings);

        System.out.println(result); // 2
    }

    public static int solution(int[][] meetings) {

        // TODO: 직접 구현
        int[] startTimes = new int[meetings.length];
        int[] endTimes = new int[meetings.length];

        for(int i = 0; i < meetings.length; i++){
            startTimes[i] = meetings[i][0];
            endTimes[i] = meetings[i][1];
        }

        Arrays.sort(startTimes);
        Arrays.sort(endTimes);

        int startIndex = 0;
        int endIndex = 0;
        int currentRooms = 0;
        int maxRooms = 0;

        while(startIndex < meetings.length){
            if(startTimes[startIndex] < endTimes[endIndex]){
                currentRooms++;
                startIndex++;
                maxRooms = Math.max(maxRooms, currentRooms);
            }else{
                currentRooms--;
                endIndex++;
            }
        }


        return maxRooms;
    }
}
