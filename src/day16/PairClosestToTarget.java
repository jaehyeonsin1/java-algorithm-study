package day16;

public class PairClosestToTarget {

    /*
    [문제] target에 가장 가까운 두 수의 합 찾기

    오름차순으로 정렬된 정수 배열 numbers와
    정수 target이 주어졌을 때,

    서로 다른 두 숫자의 합 중
    target과의 차이가 가장 작은 합을 반환하시오.

    정답이 여러 개라면 아무거나 반환해도 된다.


    예시 1

    입력:
    numbers = [1, 3, 4, 7, 10]
    target = 12

    출력:
    11

    설명:
    가능한 합 중
    1 + 10 = 11
    3 + 10 = 13

    둘 다 target과 차이가 1이므로
    11 또는 13을 반환해도 된다.


    예시 2

    입력:
    numbers = [2, 5, 8, 11]
    target = 14

    출력:
    13

    설명:
    2 + 11 = 13이 target 14에 가장 가깝다.
    */

    public static void main(String[] args) {

        int[] numbers = {1, 3, 4, 7, 10};
        int target = 12;

        int result = solution(numbers, target);

        System.out.println(result); // 11 또는 13
    }

    public static int solution(int[] numbers, int target) {

        // TODO: 직접 구현
        int left = 0;
        int right = numbers.length -1;

        int closestSum = numbers[left] + numbers[right];
        int minDiff = Math.abs(closestSum -target);
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            int diff = Math.abs(sum - target);

            if(diff < minDiff){
                minDiff = diff;
                closestSum = sum;
            }

            if(sum < target){
                left++;
            }else if(sum > target){
                right--;
            }else{
                return sum;
            }
            
        }

        return closestSum;
    }
}