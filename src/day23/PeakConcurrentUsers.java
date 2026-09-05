package day23;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class PeakConcurrentUsers {

    /*
    [기업 코테형 모의 문제] 최대 동시 접속자와 최초 발생 시각

    어떤 통신 서비스의 사용자 접속 기록이 2차원 정수 배열 sessions로 주어집니다.
    각 기록은 [접속 시각, 종료 시각]을 의미합니다.

    사용자는 접속 시각부터 서비스에 접속한 상태이고,
    종료 시각에는 접속이 끝난 상태입니다.
    즉, 접속 구간은 [접속 시각, 종료 시각)입니다.

    동시에 접속한 사용자의 최대 수와,
    그 최대 인원이 최초로 만들어진 시각을 배열에 담아 반환하세요.

    반환 형식:
    [최대 동시 접속자 수, 최대 인원이 최초로 만들어진 시각]


    예시 1

    입력:
    sessions = [[1, 5], [2, 6], [4, 8], [5, 7]]

    출력:
    [3, 4]

    설명:
    시각 4에 세 명이 동시에 접속하면서 최대 인원 3명이 최초로 만들어집니다.
    시각 5에는 첫 번째 사용자가 종료되고 네 번째 사용자가 접속하므로
    동시 접속자 수는 여전히 3명입니다.


    예시 2

    입력:
    sessions = [[1, 3], [3, 5], [5, 7]]

    출력:
    [1, 1]

    설명:
    종료 시각에는 이미 접속이 끝난 상태이므로 세 사용자는 서로 겹치지 않습니다.


    예시 3

    입력:
    sessions = [[2, 10], [2, 5], [2, 7]]

    출력:
    [3, 2]


    제한 사항

    1 <= sessions.length <= 100,000
    sessions[i].length == 2
    0 <= sessions[i][0] < sessions[i][1] <= 1,000,000
    */

    public static void main(String[] args) {

        int[][] sessions = {
                {1, 5},
                {2, 6},
                {4, 8},
                {5, 7}
        };

        int[] result = solution(sessions);

        System.out.println(Arrays.toString(result)); // [3, 4]
    }

    public static int[] solution(int[][] sessions) {

        // TODO: 직접 구현
        Map<Integer, Integer> timeline = new TreeMap<>();
        for(int[] session : sessions){
            int start = session[0];
            int end = session[1];

            timeline.put(start, timeline.getOrDefault(start, 0) + 1);
            timeline.put(end, timeline.getOrDefault(end, 0) - 1);
        }

        int currentUsers = 0;
        int maxUsers = 0;
        int peakTime = 0;

        for(Map.Entry<Integer, Integer> entry : timeline.entrySet()){
            int time = entry.getKey();
            int change = entry.getValue();

            currentUsers += change;

            if(maxUsers < currentUsers){
                maxUsers = currentUsers;
                peakTime = time;
            }
        }

        return new int[]{maxUsers, peakTime};
    }
}
