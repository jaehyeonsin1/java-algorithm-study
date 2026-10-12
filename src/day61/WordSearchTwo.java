package day61;

import java.util.ArrayList;
import java.util.List;

public class WordSearchTwo {

    /*
    [트라이/DFS·백트래킹] 단어 검색 II

    m x n 크기의 문자 보드 board와 문자열 배열 words가 주어집니다.

    보드에서 만들 수 있는 words의 모든 단어를 반환하세요.
    단어는 상하좌우로 인접한 칸의 문자를 이어서 만들 수 있습니다.

    하나의 단어를 만드는 동안 같은 칸을 두 번 이상 사용할 수 없으며,
    결과에 같은 단어를 중복해서 포함하면 안 됩니다.
    반환 순서는 상관없습니다.


    예시 1

    입력:
    board = [["o", "a", "a", "n"],
             ["e", "t", "a", "e"],
             ["i", "h", "k", "r"],
             ["i", "f", "l", "v"]]
    words = ["oath", "pea", "eat", "rain"]

    출력:
    ["eat", "oath"]

    설명:
    "oath"와 "eat"은 인접한 칸을 이어서 만들 수 있지만,
    "pea"와 "rain"은 만들 수 없습니다.


    예시 2

    입력:
    board = [["a", "b"],
             ["c", "d"]]
    words = ["abcb"]

    출력:
    []

    설명:
    "abcb"를 만들려면 문자 'b'가 있는 칸을 두 번 사용해야 하므로
    조건을 만족하지 않습니다.


    제한 사항

    1 <= board.length, board[i].length <= 12
    board[i][j]는 소문자 영어 알파벳입니다.
    1 <= words.length <= 30000
    1 <= words[i].length <= 10
    words[i]는 소문자 영어 알파벳으로만 이루어져 있습니다.
    words의 모든 문자열은 서로 다릅니다.
    */

    public static void main(String[] args) {

        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};

        List<String> result = solution(board, words);

        System.out.println(result); // [eat, oath]
    }

    public static List<String> solution(char[][] board, String[] words) {

        // TODO: 직접 구현
        return new ArrayList<>();
    }
}
