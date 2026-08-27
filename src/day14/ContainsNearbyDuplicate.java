package day14;

import java.util.HashSet;
import java.util.Set;

public class ContainsNearbyDuplicate {

    /*
    [문제] 가까운 위치에 중복 숫자가 있는지 확인하기

    정수 배열 numbers와 정수 k가 주어졌을 때,
    같은 숫자가 등장하는 두 인덱스의 차이가
    k 이하인 경우가 하나라도 존재하면 true를 반환하시오.

    존재하지 않으면 false를 반환하시오.


    예시 1

    입력:
    numbers = [1, 2, 3, 1]
    k = 3

    출력:
    true

    설명:
    numbers[0] = 1
    numbers[3] = 1

    인덱스 차이:
    3 - 0 = 3

    k 이하이므로 true.


    예시 2

    입력:
    numbers = [1, 2, 3, 1]
    k = 2

    출력:
    false

    설명:
    같은 숫자 1이 있지만
    인덱스 차이가 3이므로 k보다 크다.


    예시 3

    입력:
    numbers = [1, 0, 1, 1]
    k = 1

    출력:
    true

    설명:
    인덱스 2와 3의 값이 1로 같고
    인덱스 차이가 1이다.
    */

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 1};
        int k = 3;

        boolean result = solution(numbers, k);

        System.out.println(result); // true
    }

    public static boolean solution(int[] numbers, int k) {

        Set<Integer> set = new HashSet<>();

        // TODO: 직접 구현
        for (int i = 0; i < numbers.length; i++) {
            if(set.contains(numbers[i])){
                return true;
            }

            set.add(numbers[i]);

            if(i >= k){
                set.remove(numbers[i - k]);
            }
        }

        return false;
    }
}