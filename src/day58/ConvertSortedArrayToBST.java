package day58;

public class ConvertSortedArrayToBST {

    /*
    [트리/이진 탐색 트리·분할 정복] 정렬된 배열을 이진 탐색 트리로 변환

    오름차순으로 정렬된 정수 배열 numbers가 주어집니다.

    배열의 모든 원소를 사용해 높이 균형 이진 탐색 트리를 만들고
    그 루트 노드를 반환하세요.

    높이 균형 이진 트리는 모든 노드에서 왼쪽 서브트리와
    오른쪽 서브트리의 높이 차이가 1 이하인 트리입니다.
    조건을 만족하는 트리가 여러 개라면 그중 아무거나 반환할 수 있습니다.


    예시 1

    입력:
    numbers = [-10, -3, 0, 5, 9]

    출력:
    [0, -3, 9, -10, null, 5]

    설명:
    [0, -10, 5, null, -3, null, 9]도 올바른 높이 균형
    이진 탐색 트리입니다.


    예시 2

    입력:
    numbers = [1, 3]

    출력:
    [3, 1]

    설명:
    [1, null, 3]도 올바른 결과입니다.


    예시 3

    입력:
    numbers = []

    출력:
    []


    제한 사항

    0 <= numbers.length <= 10000
    -10000 <= numbers[i] <= 10000
    numbers는 중복 없이 오름차순으로 정렬되어 있습니다.
    */

    public static void main(String[] args) {

        int[] numbers = {-10, -3, 0, 5, 9};

        TreeNode result = solution(numbers);

        System.out.println(result == null ? "[]" : result.value); // 0
    }

    public static TreeNode solution(int[] numbers) {

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
