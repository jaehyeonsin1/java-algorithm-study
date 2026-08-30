package day17;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {

    /*
    [문제] 중복 없는 가장 긴 부분 문자열 찾기

    문자열 text가 주어졌을 때,
    같은 문자가 중복되지 않는 가장 긴 연속 부분 문자열의 길이를 반환하세요.

    부분 문자열은 원래 문자열에서 연속된 문자들로 이루어져야 합니다.


    예시 1

    입력:
    text = "abcabcbb"

    출력:
    3

    설명:
    중복 문자가 없는 가장 긴 부분 문자열은 "abc"이며 길이는 3입니다.


    예시 2

    입력:
    text = "bbbbb"

    출력:
    1

    설명:
    중복 문자가 없는 가장 긴 부분 문자열은 "b"이며 길이는 1입니다.


    예시 3

    입력:
    text = "pwwkew"

    출력:
    3

    설명:
    "wke" 또는 "kew"의 길이가 3입니다.


    제한 사항

    0 <= text.length() <= 100,000
    text는 영문 소문자로만 이루어져 있습니다.
    */

    public static void main(String[] args) {

        String text = "abcabcbb";

        int result = solution(text);

        System.out.println(result); // 3
    }

    public static int solution(String text) {

        // TODO: 직접 구현
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < text.length(); right++){
            char current = text.charAt(right);
                while(set.contains(current)){
                    set.remove(text.charAt(left));
                    left++;
                }
                set.add(current);
                int length = right - left + 1;
                if(maxLength < length){
                    maxLength = length;
                }
            }

        return maxLength;
    }
}
