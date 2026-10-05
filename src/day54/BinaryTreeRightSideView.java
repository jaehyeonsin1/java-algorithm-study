package day54;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {

    /*
    [트리/BFS·DFS] 이진 트리 오른쪽 모습

    이진 트리의 루트 노드 root가 주어집니다.

    트리를 오른쪽에서 바라보았을 때 보이는 노드의 값을
    위에서 아래 순서로 반환하세요.

    각 깊이에서 가장 오른쪽에 있는 노드가 보이며,
    트리가 비어 있다면 빈 목록을 반환합니다.


    예시 1

    입력:
    root = [1, 2, 3, null, 5, null, 4]

    출력:
    [1, 3, 4]

    설명:
    깊이별로 가장 오른쪽에 있는 노드는 1, 3, 4입니다.


    예시 2

    입력:
    root = [1, 2, 3, 4, null, null, null, 5]

    출력:
    [1, 3, 4, 5]


    예시 3

    입력:
    root = []

    출력:
    []


    제한 사항

    트리의 노드 수는 0개 이상 100개 이하입니다.
    -100 <= node.value <= 100
    */

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        List<Integer> result = solution(root);

        System.out.println(result); // [1, 3, 4]
    }

    public static List<Integer> solution(TreeNode root) {

        // TODO: 직접 구현
        return new ArrayList<>();
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
