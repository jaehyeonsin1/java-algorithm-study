package day33;

public class LongestCommonSubsequence {

    /*
    [동적 계획법] 최장 공통 부분 수열

    두 문자열 first와 second가 주어집니다.
    두 문자열에서 문자의 순서를 유지하며 일부 문자를 선택했을 때,
    공통으로 만들 수 있는 가장 긴 부분 수열의 길이를 반환하세요.

    부분 수열의 문자들은 원래 문자열에서 연속할 필요는 없습니다.


    예시 1

    입력:
    first = "abcde"
    second = "ace"

    출력:
    3

    설명:
    두 문자열에서 "ace"를 공통 부분 수열로 만들 수 있습니다.


    예시 2

    입력:
    first = "abc"
    second = "abc"

    출력:
    3


    예시 3

    입력:
    first = "abc"
    second = "def"

    출력:
    0


    제한 사항

    1 <= first.length(), second.length() <= 1,000
    first와 second는 영문 소문자로만 이루어져 있습니다.
    */

    public static void main(String[] args) {

        String first = "abcde";
        String second = "ace";

        int result = solution(first, second);

        System.out.println(result); // 3
    }

    public static int solution(String first, String second) {

        int firstLength = first.length();
        int secondLength = second.length();
        int[][] longestLength = new int[firstLength + 1][secondLength + 1];

        for (int firstIndex = 1; firstIndex <= firstLength; firstIndex++) {
            for (int secondIndex = 1; secondIndex <= secondLength; secondIndex++) {
                char firstCharacter = first.charAt(firstIndex - 1);
                char secondCharacter = second.charAt(secondIndex - 1);

                if (firstCharacter == secondCharacter) {
                    longestLength[firstIndex][secondIndex]
                            = longestLength[firstIndex - 1][secondIndex - 1] + 1;
                } else {
                    longestLength[firstIndex][secondIndex] = Math.max(
                            longestLength[firstIndex - 1][secondIndex],
                            longestLength[firstIndex][secondIndex - 1]
                    );
                }
            }
        }

        return longestLength[firstLength][secondLength];
    }
}
