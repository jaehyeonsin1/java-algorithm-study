package day50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReconstructItinerary {

    /*
    [그래프/오일러 경로] 여행 일정 재구성

    항공권 목록 tickets가 주어집니다.

    tickets[i] = [departure, arrival]은 departure 공항에서
    arrival 공항으로 이동하는 항공권 한 장을 의미합니다.

    여행은 항상 "JFK" 공항에서 시작하며,
    주어진 항공권을 모두 정확히 한 번씩 사용해야 합니다.

    가능한 여행 일정이 여러 개라면 공항 코드를 순서대로 비교했을 때
    사전순으로 가장 앞서는 일정을 반환하세요.

    모든 항공권을 사용할 수 있는 일정이 반드시 존재합니다.


    예시 1

    입력:
    tickets = [
        ["MUC", "LHR"],
        ["JFK", "MUC"],
        ["SFO", "SJC"],
        ["LHR", "SFO"]
    ]

    출력:
    ["JFK", "MUC", "LHR", "SFO", "SJC"]

    설명:
    JFK에서 출발하여 모든 항공권을 한 번씩 사용하는 유일한 일정입니다.


    예시 2

    입력:
    tickets = [
        ["JFK", "SFO"],
        ["JFK", "ATL"],
        ["SFO", "ATL"],
        ["ATL", "JFK"],
        ["ATL", "SFO"]
    ]

    출력:
    ["JFK", "ATL", "JFK", "SFO", "ATL", "SFO"]

    설명:
    모든 항공권을 사용하는 일정 중 사전순으로 가장 앞서는 경로입니다.


    제한 사항

    1 <= tickets.length <= 300
    tickets[i].length == 2
    departure와 arrival은 영문 대문자 3글자로 이루어진 공항 코드입니다.
    출발 공항과 도착 공항이 같은 항공권은 없습니다.
    같은 출발지와 도착지를 가진 항공권이 여러 장 존재할 수 있습니다.
    */

    public static void main(String[] args) {

        List<List<String>> tickets = new ArrayList<>();
        tickets.add(Arrays.asList("JFK", "SFO"));
        tickets.add(Arrays.asList("JFK", "ATL"));
        tickets.add(Arrays.asList("SFO", "ATL"));
        tickets.add(Arrays.asList("ATL", "JFK"));
        tickets.add(Arrays.asList("ATL", "SFO"));

        List<String> result = solution(tickets);

        System.out.println(result);
        // [JFK, ATL, JFK, SFO, ATL, SFO]
    }

    public static List<String> solution(List<List<String>> tickets) {

        // TODO: 직접 구현
        return new ArrayList<>();
    }
}
