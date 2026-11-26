package day70;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MinimumSemesters {

    /*
    [그래프/위상 정렬] 모든 강의를 마치는 최소 학기 수

    1번부터 n번까지 총 n개의 강의가 있습니다.

    relations[i] = [previousCourse, nextCourse]는
    nextCourse 강의를 수강하기 전에 previousCourse 강의를 먼저 수강해야 한다는 뜻입니다.

    한 학기에는 선수 과목을 모두 이수한 강의를 원하는 만큼 동시에 수강할 수 있습니다.
    모든 강의를 마치는 데 필요한 최소 학기 수를 반환하세요.

    선수 과목 관계에 순환이 있어 모든 강의를 마칠 수 없다면 -1을 반환하세요.


    예시 1

    입력:
    n = 3
    relations = [[1, 3], [2, 3]]

    출력:
    2

    설명:
    첫 학기에 1번과 2번 강의를 함께 수강하고,
    두 번째 학기에 3번 강의를 수강할 수 있습니다.


    예시 2

    입력:
    n = 3
    relations = [[1, 2], [2, 3], [3, 1]]

    출력:
    -1

    설명:
    선수 과목 관계에 순환이 있어 모든 강의를 마칠 수 없습니다.


    예시 3

    입력:
    n = 4
    relations = []

    출력:
    1

    설명:
    선수 과목이 없으므로 모든 강의를 첫 학기에 함께 수강할 수 있습니다.


    제한 사항

    1 <= n <= 5000
    0 <= relations.length <= 5000
    relations[i].length == 2
    1 <= previousCourse, nextCourse <= n
    모든 선수 과목 관계는 서로 다릅니다.
    */

    public static void main(String[] args) {

        int n = 3;
        int[][] relations = {
                {1, 3},
                {2, 3}
        };

        int result = solution(n, relations);

        System.out.println(result); // 2
    }

    public static int solution(int n, int[][] relations) {

        List<List<Integer>> nextCourses = new ArrayList<>();
        int[] indegrees = new int[n + 1];

        for (int course = 0; course <= n; course++) {
            nextCourses.add(new ArrayList<>());
        }

        for (int[] relation : relations) {
            int previousCourse = relation[0];
            int nextCourse = relation[1];

            nextCourses.get(previousCourse).add(nextCourse);
            indegrees[nextCourse]++;
        }

        Deque<Integer> queue = new ArrayDeque<>();

        for (int course = 1; course <= n; course++) {
            if (indegrees[course] == 0) {
                queue.offer(course);
            }
        }

        int semesters = 0;
        int completedCourses = 0;

        while (!queue.isEmpty()) {
            int availableCourses = queue.size();

            for (int course = 0; course < availableCourses; course++) {
                int currentCourse = queue.poll();
                completedCourses++;

                for (int nextCourse : nextCourses.get(currentCourse)) {
                    indegrees[nextCourse]--;

                    if (indegrees[nextCourse] == 0) {
                        queue.offer(nextCourse);
                    }
                }
            }

            semesters++;
        }

        return completedCourses == n ? semesters : -1;
    }
}
