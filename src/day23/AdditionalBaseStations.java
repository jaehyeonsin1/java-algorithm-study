package day23;

public class AdditionalBaseStations {

    /*
    [기업 코테형 모의 문제] 기지국 최소 추가 설치

    1번부터 n번까지 일렬로 배치된 아파트가 있습니다.
    일부 아파트에는 이미 기지국이 설치되어 있으며,
    기지국이 설치된 아파트 번호는 오름차순 배열 stations로 주어집니다.

    하나의 기지국은 설치된 아파트를 기준으로 왼쪽과 오른쪽 각각 w칸까지
    전파를 전달할 수 있습니다.

    모든 아파트에 전파가 도달하도록 새로 설치해야 하는
    기지국의 최소 개수를 반환하세요.


    예시 1

    입력:
    n = 11
    stations = [4, 11]
    w = 1

    출력:
    3

    설명:
    기존 기지국은 [3, 5], [10, 11] 구간을 담당합니다.
    전파가 닿지 않는 [1, 2], [6, 9] 구간에 기지국 3개를 추가하면 됩니다.


    예시 2

    입력:
    n = 16
    stations = [9]
    w = 2

    출력:
    3

    설명:
    기존 기지국은 [7, 11] 구간을 담당합니다.
    [1, 6] 구간에 2개, [12, 16] 구간에 1개를 추가하면 됩니다.


    예시 3

    입력:
    n = 5
    stations = [3]
    w = 2

    출력:
    0


    제한 사항

    1 <= n <= 200,000,000
    1 <= stations.length <= 10,000
    1 <= stations[i] <= n
    stations는 오름차순이며 중복이 없습니다.
    0 <= w <= 10,000
    */

    public static void main(String[] args) {

        int n = 11;
        int[] stations = {4, 11};
        int w = 1;

        int result = solution(n, stations, w);

        System.out.println(result); // 3
    }

    public static int solution(int n, int[] stations, int w) {

        // TODO: 직접 구현
        return 0;
    }
}
