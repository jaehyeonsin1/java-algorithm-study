package day11;

public class RangeSumQueries {

    /*
    [문제] 여러 구간의 합 구하기

    정수 배열 numbers와 여러 개의 구간 queries가 주어진다.

    각 query는
    [start, end]
    형태이다.

    각 구간의 합을 계산하여 배열로 반환하시오.

    예시

    numbers = [2, 4, 1, 5, 3]

    queries =
    [
        [0, 2],
        [1, 3],
        [2, 4]
    ]

    출력:
    [7, 10, 9]

    설명:

    2 + 4 + 1 = 7
    4 + 1 + 5 = 10
    1 + 5 + 3 = 9
    */

    public static void main(String[] args) {

        int[] numbers = {2, 4, 1, 5, 3};

        int[][] queries = {
                {0, 2},
                {1, 3},
                {2, 4}
        };

        int[] result = solution(numbers, queries);

        for (int number : result) {
            System.out.println(number);
        }
    }

    public static int[] solution(int[] numbers, int[][] queries) {

        int[] prefix = new int[numbers.length + 1];

        for (int i = 0; i < numbers.length; i++) {
            prefix[i + 1] = prefix[i] + numbers[i];
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int start = queries[i][0];
            int end = queries[i][1];

            result[i] = prefix[end + 1] - prefix[start];
        }

        return result;
    }
}