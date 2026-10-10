package day59;

public class ImplementTrie {

    /*
    [트라이] 접두사 트리 구현

    소문자 영어 단어를 저장하고 검색할 수 있는 Trie 클래스를 구현하세요.

    Trie 클래스는 다음 기능을 제공해야 합니다.

    Trie()
    빈 트라이를 생성합니다.

    void insert(String word)
    문자열 word를 트라이에 저장합니다.

    boolean search(String word)
    word가 완전한 단어로 저장되어 있으면 true,
    그렇지 않으면 false를 반환합니다.

    boolean startsWith(String prefix)
    저장된 단어 중 prefix로 시작하는 단어가 하나라도 있으면 true,
    그렇지 않으면 false를 반환합니다.


    예시 1

    입력:
    ["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
    [[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]

    출력:
    [null, null, true, false, true, null, true]

    설명:
    Trie trie = new Trie();
    trie.insert("apple");
    trie.search("apple");     // true
    trie.search("app");       // false
    trie.startsWith("app");   // true
    trie.insert("app");
    trie.search("app");       // true


    제한 사항

    1 <= word.length, prefix.length <= 2000
    word와 prefix는 소문자 영어 알파벳으로만 이루어져 있습니다.
    insert, search, startsWith는 각각 최대 30000번 호출됩니다.
    */

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("apple");
        System.out.println(trie.search("apple")); // true
        System.out.println(trie.search("app")); // false
        System.out.println(trie.startsWith("app")); // true

        trie.insert("app");
        System.out.println(trie.search("app")); // true
    }

    static class Trie {

        Trie() {

            // TODO: 직접 구현
        }

        public void insert(String word) {

            // TODO: 직접 구현
        }

        public boolean search(String word) {

            // TODO: 직접 구현
            return false;
        }

        public boolean startsWith(String prefix) {

            // TODO: 직접 구현
            return false;
        }
    }
}
