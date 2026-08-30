package day18;

import java.util.Arrays;

public class MergeIntervals {

    /*
    [문제] 겹치는 구간 합치기

    여러 구간을 나타내는 2차원 정수 배열 intervals가 주어집니다.
    각 구간은 [시작, 끝] 형태입니다.

    서로 겹치는 모든 구간을 합친 뒤,
    겹치지 않는 구간들의 배열을 반환하세요.


    예시 1

    입력:
    intervals = [[1, 3], [2, 6], [8, 10], [15, 18]]

    출력:
    [[1, 6], [8, 10], [15, 18]]

    설명:
    [1, 3]과 [2, 6]은 겹치므로 [1, 6]으로 합칩니다.


    예시 2

    입력:
    intervals = [[1, 4], [4, 5]]

    출력:
    [[1, 5]]

    설명:
    끝점과 시작점이 같은 구간도 겹치는 것으로 처리합니다.


    예시 3

    입력:
    intervals = [[1, 4], [0, 2], [3, 5]]

    출력:
    [[0, 5]]


    제한 사항

    1 <= intervals.length <= 10,000
    intervals[i].length == 2
    0 <= intervals[i][0] <= intervals[i][1] <= 100,000
    */

    public static void main(String[] args) {

        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] result = solution(intervals);

        System.out.println(Arrays.deepToString(result));
        // [[1, 6], [8, 10], [15, 18]]
    }

    public static int[][] solution(int[][] intervals) {

        // TODO: 직접 구현
        return new int[0][0];
    }
}
