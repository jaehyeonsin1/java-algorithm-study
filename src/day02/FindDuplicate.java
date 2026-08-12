    package day02;

    import java.util.HashSet;
    import java.util.Set;

    public class FindDuplicate {

        /*
        [문제] 중복 숫자 찾기

        정수 배열 numbers가 주어졌을 때,
        같은 숫자가 두 번 이상 등장하면 true,
        모든 숫자가 서로 다르면 false를 반환하시오.

        예시 1
        입력: [1, 2, 3, 2, 5]
        출력: true

        예시 2
        입력: [1, 2, 3, 4, 5]
        출력: false
        */

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 2, 5};

            boolean result = solution(numbers);

            System.out.println(result); // true

            boolean setResult = solutionWithSet(numbers);
            System.out.println(setResult);
        }

        public static boolean solution(int[] numbers) {

            // TODO: 직접 구현
            for(int i = 0; i < numbers.length; i++){
                for(int j = i + 1; j < numbers.length; j++){
                    if(numbers[i] == numbers[j]){
                        return true;
                    }
                }
            }
            return false;
        }

        public static boolean solutionWithSet(int[] numbers) {

            Set<Integer> set = new HashSet<>();

            // TODO: 직접 구현
            for (int number : numbers) {
                if (!set.add(number)){
                    return true;
                }
            }

            return false;
        }
    }