package day54;

import java.util.ArrayList;
import java.util.List;

public class PathSumTwo {

    /*
    [트리/DFS·백트래킹] 목표 합 경로 찾기 II

    이진 트리의 루트 노드 root와 정수 targetSum이 주어집니다.

    루트에서 리프 노드까지 이어지는 경로 중
    경로에 포함된 모든 노드 값의 합이 targetSum과 같은 경로를
    모두 반환하세요.

    리프 노드는 자식이 없는 노드이며, 경로의 반환 순서는 상관없습니다.


    예시 1

    입력:
    root = [5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1]
    targetSum = 22

    출력:
    [[5, 4, 11, 2], [5, 8, 4, 5]]

    설명:
    두 경로 모두 루트에서 리프까지 이어지며 노드 값의 합이 22입니다.


    예시 2

    입력:
    root = [1, 2, 3]
    targetSum = 5

    출력:
    []

    설명:
    합이 5인 루트에서 리프까지의 경로가 없습니다.


    예시 3

    입력:
    root = []
    targetSum = 0

    출력:
    []


    제한 사항

    트리의 노드 수는 0개 이상 5000개 이하입니다.
    -1000 <= node.value <= 1000
    -1000 <= targetSum <= 1000
    */

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        List<List<Integer>> result = solution(root, 22);

        System.out.println(result); // [[5, 4, 11, 2], [5, 8, 4, 5]]
    }

    public static List<List<Integer>> solution(TreeNode root, int targetSum) {

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
