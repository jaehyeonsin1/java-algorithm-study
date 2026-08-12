package day02;

public class CountEven {
    /*
    [문제] 짝수 개수 구하기
    정수 배열 numbers가 주어졌을 때,
    배열에 들어있는 숫자 중 짝수의 개수를 반환하시오.
     */
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};

        int result = solution(numbers);

        System.out.println(result);

    }

    public static int solution(int[] numbers){

        //TODO 직접 구현
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }

        //return (int) Arrays.stream(numbers).filter(n -> n % 2 == 0).count();
        return count;
    }
}
