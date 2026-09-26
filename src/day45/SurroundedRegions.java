package day45;

import java.util.Arrays;

public class SurroundedRegions {

    /*
    [그래프/DFS·BFS] 포위된 영역

    'X'와 'O'로 이루어진 m x n 크기의 2차원 배열 board가 주어집니다.

    상하좌우로 연결된 'O' 영역 중 'X'로 완전히 둘러싸인 영역을 찾아
    해당 영역의 모든 'O'를 'X'로 변경하세요.

    board의 가장자리에 있는 'O' 또는 가장자리의 'O'와 연결된 영역은
    'X'로 완전히 둘러싸인 영역이 아니므로 변경하지 않습니다.


    예시 1

    입력:
    board = [
        ['X', 'X', 'X', 'X'],
        ['X', 'O', 'O', 'X'],
        ['X', 'X', 'O', 'X'],
        ['X', 'O', 'X', 'X']
    ]

    출력:
    [
        ['X', 'X', 'X', 'X'],
        ['X', 'X', 'X', 'X'],
        ['X', 'X', 'X', 'X'],
        ['X', 'O', 'X', 'X']
    ]

    설명:
    가운데의 'O' 영역은 'X'로 완전히 둘러싸여 있으므로 'X'로 변경됩니다.
    마지막 행의 'O'는 가장자리에 있으므로 변경되지 않습니다.


    예시 2

    입력:
    board = [['X']]

    출력:
    [['X']]


    예시 3

    입력:
    board = [
        ['O', 'O'],
        ['O', 'O']
    ]

    출력:
    [
        ['O', 'O'],
        ['O', 'O']
    ]

    설명:
    모든 'O'가 가장자리와 연결되어 있으므로 변경되지 않습니다.


    제한 사항

    1 <= board.length <= 200
    1 <= board[row].length <= 200
    board[row][column]은 'X' 또는 'O'입니다.
    입력 배열 board를 직접 변경하세요.
    */

    public static void main(String[] args) {

        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        solution(board);

        System.out.println(Arrays.deepToString(board));
        // [[X, X, X, X], [X, X, X, X], [X, X, X, X], [X, O, X, X]]
    }

    public static void solution(char[][] board) {

        // TODO: 직접 구현
    }
}
