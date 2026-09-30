package day49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluateDivision {

    /*
    [그래프/DFS·BFS] 나눗셈 계산

    변수 사이의 나눗셈 관계를 나타내는 equations와 그 결과인 values가 주어집니다.

    equations[i] = [variableA, variableB]이고 values[i] = value라면
    variableA / variableB = value라는 의미입니다.

    각 queries[j] = [variableC, variableD]에 대해
    variableC / variableD의 값을 계산하여 배열로 반환하세요.

    주어진 관계만으로 값을 계산할 수 없다면 -1.0을 반환합니다.
    입력에는 모순되는 관계가 없으며 0으로 나누는 경우도 없습니다.


    예시 1

    입력:
    equations = [["a", "b"], ["b", "c"]]
    values = [2.0, 3.0]
    queries = [["a", "c"], ["b", "a"], ["a", "e"], ["a", "a"], ["x", "x"]]

    출력:
    [6.0, 0.5, -1.0, 1.0, -1.0]

    설명:
    a / b = 2.0이고 b / c = 3.0이므로 a / c = 6.0입니다.
    b / a는 a / b의 역수이므로 0.5입니다.
    e와 x는 주어진 관계에 등장하지 않으므로 계산할 수 없습니다.


    예시 2

    입력:
    equations = [["a", "b"], ["b", "c"], ["bc", "cd"]]
    values = [1.5, 2.5, 5.0]
    queries = [["a", "c"], ["c", "b"], ["bc", "cd"], ["cd", "bc"]]

    출력:
    [3.75, 0.4, 5.0, 0.2]


    제한 사항

    1 <= equations.length <= 20
    equations.length == values.length
    1 <= queries.length <= 20
    equations[i].length == 2
    queries[i].length == 2
    변수 이름은 영문 소문자와 숫자로 이루어져 있습니다.
    0.0 < values[i] <= 20.0
    */

    public static void main(String[] args) {

        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));

        double[] values = {2.0, 3.0};

        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "e"));
        queries.add(Arrays.asList("a", "a"));
        queries.add(Arrays.asList("x", "x"));

        double[] result = solution(equations, values, queries);

        System.out.println(Arrays.toString(result)); // [6.0, 0.5, -1.0, 1.0, -1.0]
    }

    public static double[] solution(List<List<String>> equations,
                                    double[] values,
                                    List<List<String>> queries) {

        // TODO: 직접 구현
        return new double[0];
    }
}
