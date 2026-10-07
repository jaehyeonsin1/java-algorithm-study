package day56;

public class RangeSumOfBST {

    /*
    [트리/이진 탐색 트리·DFS] 이진 탐색 트리의 범위 합

    이진 탐색 트리의 루트 노드 root와 두 정수 low, high가 주어집니다.

    트리에 있는 노드 중 값이 low 이상 high 이하인
    모든 노드 값의 합을 반환하세요.

    이진 탐색 트리의 모든 노드 값은 서로 다릅니다.


    예시 1

    입력:
    root = [10, 5, 15, 3, 7, null, 18]
    low = 7
    high = 15

    출력:
    32

    설명:
    범위 [7, 15]에 포함되는 노드 값은 7, 10, 15이므로
    합은 32입니다.


    예시 2

    입력:
    root = [10, 5, 15, 3, 7, 13, 18, 1, null, 6]
    low = 6
    high = 10

    출력:
    23

    설명:
    범위 [6, 10]에 포함되는 노드 값은 6, 7, 10이므로
    합은 23입니다.


    제한 사항

    트리의 노드 수는 1개 이상 20000개 이하입니다.
    1 <= node.value <= 100000
    모든 노드의 값은 서로 다릅니다.
    1 <= low <= high <= 100000
    */

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        int result = solution(root, 7, 15);

        System.out.println(result); // 32
    }

    public static int solution(TreeNode root, int low, int high) {

        // TODO: 직접 구현
        return 0;
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
