package day01;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        boolean result = solution(numbers, target);

        System.out.println(result); // true
    }

    public static boolean solution(int[] numbers, int target) {

        // TODO: 직접 구현
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target)
                    return true;
            }
        }
        return false;
    }
}