package day57;

public class DeleteNodeInBST {

    /*
    [트리/이진 탐색 트리] 이진 탐색 트리에서 노드 삭제

    이진 탐색 트리의 루트 노드 root와 정수 key가 주어집니다.

    트리에서 값이 key인 노드를 삭제한 뒤
    이진 탐색 트리의 루트 노드를 반환하세요.

    삭제할 노드가 없다면 원래 트리를 그대로 반환합니다.
    삭제 후에도 모든 노드에 대해 왼쪽 서브트리의 값은 더 작고,
    오른쪽 서브트리의 값은 더 커야 합니다.


    예시 1

    입력:
    root = [5, 3, 6, 2, 4, null, 7]
    key = 3

    출력:
    [5, 4, 6, 2, null, null, 7]

    설명:
    값이 3인 노드는 두 자식을 가지므로 적절한 후계 노드로 대체합니다.
    [5, 2, 6, null, 4, null, 7]도 올바른 결과입니다.


    예시 2

    입력:
    root = [5, 3, 6, 2, 4, null, 7]
    key = 0

    출력:
    [5, 3, 6, 2, 4, null, 7]

    설명:
    값이 0인 노드가 없으므로 트리는 바뀌지 않습니다.


    예시 3

    입력:
    root = []
    key = 0

    출력:
    []


    제한 사항

    트리의 노드 수는 0개 이상 10000개 이하입니다.
    -100000 <= node.value <= 100000
    모든 노드의 값은 서로 다릅니다.
    -100000 <= key <= 100000
    */

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        TreeNode result = solution(root, 3);

        System.out.println(result.left.value); // 4
        System.out.println(result.left.left.value); // 2
    }

    public static TreeNode solution(TreeNode root, int key) {

        // TODO: 직접 구현
        return root;
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
