package day53;

public class LowestCommonAncestorOfBinaryTree {

    /*
    [트리/DFS] 이진 트리의 최소 공통 조상

    이진 트리의 루트 노드 root와 서로 다른 두 노드 p, q가 주어집니다.

    p와 q의 최소 공통 조상을 반환하세요.

    최소 공통 조상은 p와 q를 모두 자손으로 가지는 노드 중
    가장 깊은 위치에 있는 노드입니다.

    한 노드는 자기 자신의 자손으로 간주하며,
    p와 q는 항상 트리 안에 존재합니다.


    예시 1

    입력:
    root = [3, 5, 1, 6, 2, 0, 8, null, null, 7, 4]
    p = 5, q = 1

    출력:
    3

    설명:
    노드 5와 노드 1을 모두 자손으로 가지는 가장 깊은 노드는 3입니다.


    예시 2

    입력:
    root = [3, 5, 1, 6, 2, 0, 8, null, null, 7, 4]
    p = 5, q = 4

    출력:
    5

    설명:
    노드 5는 자기 자신과 노드 4를 모두 자손으로 가지므로
    최소 공통 조상은 5입니다.


    예시 3

    입력:
    root = [1, 2]
    p = 1, q = 2

    출력:
    1


    제한 사항

    트리의 노드 수는 2개 이상 10000개 이하입니다.
    -1000000000 <= node.value <= 1000000000
    모든 노드의 값은 서로 다릅니다.
    p != q
    p와 q는 트리 안에 존재합니다.
    */

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode result = solution(root, root.left, root.right);

        System.out.println(result == null ? null : result.value); // 3
    }

    public static TreeNode solution(TreeNode root, TreeNode p, TreeNode q) {

        // TODO: 직접 구현
        return null;
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
