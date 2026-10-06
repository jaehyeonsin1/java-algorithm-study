package day55;

public class KthSmallestElementInBST {

    /*
    [트리/중위 순회] 이진 탐색 트리에서 K번째로 작은 값

    이진 탐색 트리의 루트 노드 root와 정수 k가 주어집니다.

    트리에 있는 모든 노드의 값 중 k번째로 작은 값을 반환하세요.
    k는 1부터 시작합니다.

    이진 탐색 트리의 모든 노드 값은 서로 다르며,
    k는 항상 트리의 노드 수 이하입니다.


    예시 1

    입력:
    root = [3, 1, 4, null, 2]
    k = 1

    출력:
    1

    설명:
    노드 값을 오름차순으로 정렬하면 [1, 2, 3, 4]이므로
    첫 번째로 작은 값은 1입니다.


    예시 2

    입력:
    root = [5, 3, 6, 2, 4, null, null, 1]
    k = 3

    출력:
    3

    설명:
    노드 값을 오름차순으로 정렬하면 [1, 2, 3, 4, 5, 6]이므로
    세 번째로 작은 값은 3입니다.


    제한 사항

    트리의 노드 수는 1개 이상 10000개 이하입니다.
    0 <= node.value <= 10000
    모든 노드의 값은 서로 다릅니다.
    1 <= k <= 트리의 노드 수
    */

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        int result = solution(root, 3);

        System.out.println(result); // 3
    }

    public static int solution(TreeNode root, int k) {

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
