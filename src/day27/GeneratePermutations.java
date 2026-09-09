package day27;

import java.util.ArrayList;
import java.util.List;

public class GeneratePermutations {

    /*
    [백트래킹] 모든 순열 만들기

    서로 다른 정수가 담긴 배열 numbers가 주어집니다.
    배열의 모든 숫자를 한 번씩 사용해서 만들 수 있는
    모든 순열을 리스트에 담아 반환하세요.

    순열의 반환 순서는 상관없습니다.


    예시 1

    입력:
    numbers = [1, 2, 3]

    출력:
    [[1, 2, 3], [1, 3, 2],
     [2, 1, 3], [2, 3, 1],
     [3, 1, 2], [3, 2, 1]]


    예시 2

    입력:
    numbers = [0, 1]

    출력:
    [[0, 1], [1, 0]]


    예시 3

    입력:
    numbers = [7]

    출력:
    [[7]]


    제한 사항

    1 <= numbers.length <= 8
    -10 <= numbers[i] <= 10
    numbers의 모든 숫자는 서로 다릅니다.
    */

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};

        List<List<Integer>> result = solution(numbers);

        System.out.println(result);
        // [[1, 2, 3], [1, 3, 2], [2, 1, 3],
        //  [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    }

    public static List<List<Integer>> solution(int[] numbers) {

        // TODO: 직접 구현
        return new ArrayList<>();
    }
}
