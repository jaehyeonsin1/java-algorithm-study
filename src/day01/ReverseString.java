package day01;

public class ReverseString {

    public static void main(String[] args) {
        String text = "hello";

        String result = solution(text);

        System.out.println(result); // olleh
    }

    public static String solution(String text) {

        // TODO: 직접 구현
        String result= "";

        for(int i = text.length() - 1; i >= 0; i--){
            result += text.charAt(i);
        }

        //return new StringBuilder(text).reverse().toString();

        return result;
    }
}