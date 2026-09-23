package day42;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

    /*
    [그래프/BFS] 단어 변환의 최소 단계

    시작 단어 begin, 목표 단어 target, 사용할 수 있는 단어들이 담긴
    배열 words가 주어집니다.

    한 번에 한 글자만 바꿀 수 있고, 바꾼 단어는 반드시 words에
    포함되어 있어야 합니다.

    begin에서 target으로 변환하는 가장 짧은 단어 수를 반환하세요.
    반환값에는 begin과 target도 포함합니다.
    변환할 수 없다면 0을 반환하세요.


    예시 1

    입력:
    begin = "hit"
    target = "cog"
    words = ["hot", "dot", "dog", "lot", "log", "cog"]

    출력:
    5

    설명:
    "hit" -> "hot" -> "dot" -> "dog" -> "cog" 순서로
    변환할 수 있으며 총 5개의 단어를 거칩니다.


    예시 2

    입력:
    begin = "hit"
    target = "cog"
    words = ["hot", "dot", "dog", "lot", "log"]

    출력:
    0

    설명:
    target인 "cog"가 words에 없으므로 변환할 수 없습니다.


    예시 3

    입력:
    begin = "a"
    target = "c"
    words = ["a", "b", "c"]

    출력:
    2


    제한 사항

    1 <= begin.length() <= 10
    target.length() == begin.length()
    1 <= words.length <= 5,000
    words의 모든 단어 길이는 begin과 같습니다.
    begin, target, words의 단어는 영문 소문자로만 이루어져 있습니다.
    words에는 중복된 단어가 없습니다.
    begin과 target은 서로 다릅니다.
    */

    public static void main(String[] args) {

        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        int result = solution(begin, target, words);

        System.out.println(result); // 5
    }

    public static int solution(String begin, String target, String[] words) {

        Set<String> unvisitedWords = new HashSet<>(Arrays.asList(words));
        if (!unvisitedWords.contains(target)) {
            return 0;
        }

        Queue<String> queue = new ArrayDeque<>();
        queue.offer(begin);
        unvisitedWords.remove(begin);

        int wordCount = 1;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int count = 0; count < levelSize; count++) {
                String currentWord = queue.poll();

                if (currentWord.equals(target)) {
                    return wordCount;
                }

                char[] characters = currentWord.toCharArray();

                for (int index = 0; index < characters.length; index++) {
                    char originalCharacter = characters[index];

                    for (char nextCharacter = 'a'; nextCharacter <= 'z'; nextCharacter++) {
                        if (nextCharacter == originalCharacter) {
                            continue;
                        }

                        characters[index] = nextCharacter;
                        String nextWord = new String(characters);

                        if (unvisitedWords.remove(nextWord)) {
                            queue.offer(nextWord);
                        }
                    }

                    characters[index] = originalCharacter;
                }
            }

            wordCount++;
        }

        return 0;
    }
}
