package day04;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {

    /*
    [문제] 애너그램 판별하기

    두 문자열 text1과 text2가 주어졌을 때,
    두 문자열이 애너그램 관계인지 확인하여
    맞으면 true, 아니면 false를 반환하시오.

    애너그램이란?
    문자의 순서는 다르지만
    각 문자의 종류와 개수가 동일한 문자열을 의미한다.

    예시 1

    입력:
    text1 = "listen"
    text2 = "silent"

    출력:
    true

    설명:
    두 문자열 모두
    l, i, s, t, e, n이 각각 1번씩 등장한다.


    예시 2

    입력:
    text1 = "banana"
    text2 = "aaabnn"

    출력:
    true


    예시 3

    입력:
    text1 = "hello"
    text2 = "world"

    출력:
    false
    */

    public static void main(String[] args) {
        String text1 = "listen";
        String text2 = "silent";

        boolean result = solution(text1, text2);

        System.out.println(result); // true
    }

    public static boolean solution(String text1, String text2) {

        if (text1.length() != text2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : text1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : text2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (!entry.getValue().equals(
                    map2.getOrDefault(entry.getKey(), 0))) {
                return false;
            }
        }

        //return map1.equal(map2);

        return true;
    }
}

