package day53;

public class DiameterOfBinaryTree {

    /*
    [트리/DFS] 이진 트리의 지름

    이진 트리의 루트 노드 root가 주어집니다.

    이진 트리의 지름은 트리 안의 두 노드를 연결하는 경로 중
    가장 긴 경로에 포함된 간선의 개수입니다.

    가장 긴 경로는 루트 노드를 지나지 않아도 됩니다.
    트리의 지름을 반환하세요.


    예시 1

    입력:
    root = [1, 2, 3, 4, 5]

    출력:
    3

    설명:
    가장 긴 경로는 [4, 2, 1, 3] 또는 [5, 2, 1, 3]이며,
    두 경로 모두 3개의 간선을 포함합니다.


    예시 2

    입력:
    root = [1, 2]

    출력:
    1


    예시 3

    입력:
    root = [1]

    출력:
    0


    제한 사항

    트리의 노드 수는 1개 이상 10000개 이하입니다.
    -100 <= node.value <= 100
    */

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int result = solution(root);

        System.out.println(result); // 3
    }

    public static int solution(TreeNode root) {

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
