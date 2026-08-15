package day04;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    /*
    [문제] 문자별 등장 횟수 세기

    문자열 text가 주어졌을 때,
    각 문자가 몇 번 등장했는지 Map에 저장하여 반환하시오.

    예시

    입력:
    "banana"

    출력:
    {b=1, a=3, n=2}

    설명:
    b는 1번
    a는 3번
    n은 2번 등장한다.
    */

    public static void main(String[] args) {
        String text = "banana";

        // TODO: solution 호출 후 결과 출력
        Map<Character, Integer> map = solution(text);

        System.out.println(map);

    }

    public static Map<Character, Integer> solution(String text) {

        // TODO: 직접 구현
        Map<Character, Integer> map = new HashMap<>();

        for(char c : text.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}