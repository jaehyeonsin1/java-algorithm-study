package day51;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    /*
    [트리/BFS] 이진 트리 레벨 순회

    이진 트리의 루트 노드 root가 주어집니다.

    루트부터 시작해 같은 깊이에 있는 노드의 값을 왼쪽에서 오른쪽 순서로 묶어
    레벨별 목록으로 반환하세요.

    트리가 비어 있다면 빈 목록을 반환하세요.


    예시 1

    입력:
    root = [3, 9, 20, null, null, 15, 7]

    출력:
    [[3], [9, 20], [15, 7]]

    설명:
    깊이 0에는 3, 깊이 1에는 9와 20,
    깊이 2에는 15와 7이 있습니다.


    예시 2

    입력:
    root = [1]

    출력:
    [[1]]


    예시 3

    입력:
    root = []

    출력:
    []


    제한 사항

    트리의 노드 수는 0개 이상 2000개 이하입니다.
    -1000 <= node.value <= 1000
    */

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = solution(root);

        System.out.println(result); // [[3], [9, 20], [15, 7]]
    }

    public static List<List<Integer>> solution(TreeNode root) {

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
