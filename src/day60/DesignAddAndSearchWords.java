package day60;

public class DesignAddAndSearchWords {

    /*
    [트라이/DFS] 단어 추가와 검색을 지원하는 자료구조 구현

    소문자 영어 단어를 저장하고 검색할 수 있는 WordDictionary 클래스를
    구현하세요.

    WordDictionary 클래스는 다음 기능을 제공해야 합니다.

    WordDictionary()
    빈 단어 사전을 생성합니다.

    void addWord(String word)
    문자열 word를 단어 사전에 저장합니다.

    boolean search(String word)
    word와 일치하는 단어가 저장되어 있으면 true,
    그렇지 않으면 false를 반환합니다.

    검색 문자열의 마침표('.')는 어떤 소문자 알파벳 하나와도
    일치할 수 있습니다.


    예시 1

    입력:
    ["WordDictionary", "addWord", "addWord", "addWord",
     "search", "search", "search", "search"]
    [[], ["bad"], ["dad"], ["mad"],
     ["pad"], ["bad"], [".ad"], ["b.."]]

    출력:
    [null, null, null, null, false, true, true, true]

    설명:
    WordDictionary dictionary = new WordDictionary();
    dictionary.addWord("bad");
    dictionary.addWord("dad");
    dictionary.addWord("mad");
    dictionary.search("pad"); // false
    dictionary.search("bad"); // true
    dictionary.search(".ad"); // true
    dictionary.search("b.."); // true


    제한 사항

    1 <= word.length <= 25
    addWord에 전달되는 word는 소문자 영어 알파벳으로만 이루어져 있습니다.
    search에 전달되는 word는 소문자 영어 알파벳 또는 마침표('.')로
    이루어져 있습니다.
    addWord와 search는 합쳐서 최대 10000번 호출됩니다.
    search 문자열에는 마침표가 최대 2개 포함됩니다.
    */

    public static void main(String[] args) {

        WordDictionary dictionary = new WordDictionary();

        dictionary.addWord("bad");
        dictionary.addWord("dad");
        dictionary.addWord("mad");

        System.out.println(dictionary.search("pad")); // false
        System.out.println(dictionary.search("bad")); // true
        System.out.println(dictionary.search(".ad")); // true
        System.out.println(dictionary.search("b..")); // true
    }

    static class WordDictionary {

        WordDictionary() {

            // TODO: 직접 구현
        }

        public void addWord(String word) {

            // TODO: 직접 구현
        }

        public boolean search(String word) {

            // TODO: 직접 구현
            return false;
        }
    }
}
