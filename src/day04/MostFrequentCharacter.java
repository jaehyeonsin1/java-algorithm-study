package day04;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {

    /*
    [문제] 가장 많이 등장한 문자 찾기

    문자열 text가 주어졌을 때,
    가장 많이 등장한 문자를 반환하시오.

    가장 많이 등장한 문자가 여러 개라면
    먼저 등장한 문자를 반환하시오.

    예시 1

    입력:
    "banana"

    출력:
    'a'

    설명:
    b는 1번
    a는 3번
    n은 2번 등장하므로
    가장 많이 등장한 문자는 a이다.

    예시 2

    입력:
    "apple"

    출력:
    'p'

    설명:
    p가 2번으로 가장 많이 등장한다.
    */

    public static void main(String[] args) {
        String text = "banana";

        char result = solution(text);

        System.out.println(result); // a
    }

    public static char solution(String text) {

        // TODO: 직접 구현
        Map<Character, Integer> map = new HashMap<>();

        for(char c : text.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxCount = 0;
        char result = ' ';

        for(char c : text.toCharArray()){
            int count = map.get(c);

            if(count > maxCount){
                maxCount = count;
                result = c;
            }
        }


        return result;
    }
}