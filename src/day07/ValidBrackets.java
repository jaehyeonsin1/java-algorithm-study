package day07;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidBrackets {

    /*
    [문제] 여러 종류의 괄호 판별하기

    '()', '{}', '[]' 세 종류의 괄호로 이루어진 문자열 text가 주어졌을 때,
    모든 괄호의 짝과 순서가 올바르면 true,
    그렇지 않으면 false를 반환하시오.

    예시 1

    입력:
    "()[]{}"

    출력:
    true


    예시 2

    입력:
    "([{}])"

    출력:
    true


    예시 3

    입력:
    "(]"

    출력:
    false


    예시 4

    입력:
    "([)]"

    출력:
    false

    설명:
    괄호의 개수는 맞지만
    괄호가 닫히는 순서가 올바르지 않다.
    */

    public static void main(String[] args) {
        String text = "([{}])";

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
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == '(' || text.charAt(i) == '{' || text.charAt(i) == '['){
                stack.push(text.charAt(i));
            }else {
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.peek();

                if (text.charAt(i) == ')' && top == '('
                        || text.charAt(i) == '}' && top == '{'
                        || text.charAt(i) == ']' && top == '[' ){
                    stack.pop();
                }else {
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }
}