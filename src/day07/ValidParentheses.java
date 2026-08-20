package day07;

public class ValidParentheses {

    /*
    [문제] 올바른 괄호 판별하기

    '('와 ')'로만 이루어진 문자열 text가 주어졌을 때,
    괄호가 올바르게 짝지어져 있으면 true,
    그렇지 않으면 false를 반환하시오.

    예시 1

    입력:
    "()()"

    출력:
    true


    예시 2

    입력:
    "(())"

    출력:
    true


    예시 3

    입력:
    "(()"

    출력:
    false


    예시 4

    입력:
    ")("

    출력:
    false
    */

    public static void main(String[] args) {
        String text = "(())";

        boolean result = solution(text);

        System.out.println(result); // true
    }

    public static boolean solution(String text) {

        // TODO: 직접 구현
        if(text == null || text.length() == 0){
            return true;
        }

        if(text.length() % 2 != 0){
            return false;
        }

        int count = 0;

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == '('){
                count++;
            }else {
                count--;
            }
            if(count < 0){
                return false;
            }
        }

        return count == 0;
    }
}