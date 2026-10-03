package day52;

public class ValidateBinarySearchTree {

    /*
    [트리/DFS] 유효한 이진 탐색 트리 판별

    이진 트리의 루트 노드 root가 주어집니다.

    주어진 트리가 유효한 이진 탐색 트리라면 true를,
    그렇지 않다면 false를 반환하세요.

    유효한 이진 탐색 트리는 다음 조건을 모두 만족해야 합니다.

    1. 모든 왼쪽 서브트리의 노드 값은 부모 노드의 값보다 작습니다.
    2. 모든 오른쪽 서브트리의 노드 값은 부모 노드의 값보다 큽니다.
    3. 왼쪽과 오른쪽 서브트리도 각각 이진 탐색 트리여야 합니다.

    같은 값을 가진 노드는 허용하지 않습니다.


    예시 1

    입력:
    root = [2, 1, 3]

    출력:
    true

    설명:
    1은 2보다 작고 3은 2보다 크므로 유효한 이진 탐색 트리입니다.


    예시 2

    입력:
    root = [5, 1, 4, null, null, 3, 6]

    출력:
    false

    설명:
    루트 5의 오른쪽 서브트리에 있는 4와 3은 5보다 작으므로
    이진 탐색 트리의 조건을 만족하지 않습니다.


    예시 3

    입력:
    root = [2, 2, 2]

    출력:
    false

    설명:
    이진 탐색 트리에서는 같은 값을 가진 노드를 허용하지 않습니다.


    제한 사항

    트리의 노드 수는 1개 이상 10000개 이하입니다.
    Integer.MIN_VALUE <= node.value <= Integer.MAX_VALUE
    */

    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        boolean result = solution(root);

        System.out.println(result); // true
    }

    public static boolean solution(TreeNode root) {

        // TODO: 직접 구현
        return false;
    }

    static class TreeNode {

        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
        }
    }
}
