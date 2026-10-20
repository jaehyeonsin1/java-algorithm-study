package day69;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class CourseScheduleTwo {

    /*
    [그래프/위상 정렬] 수강 순서 찾기

    0번부터 numCourses - 1번까지 총 numCourses개의 강의가 있습니다.

    prerequisites[i] = [course, prerequisite]는
    course 강의를 수강하기 전에 prerequisite 강의를 먼저 수강해야 한다는 뜻입니다.

    모든 강의를 수강할 수 있는 순서 하나를 반환하세요.
    가능한 순서가 여러 개라면 그중 아무 순서나 반환할 수 있습니다.
    선수 과목 관계에 순환이 있어 모든 강의를 수강할 수 없다면 빈 배열을 반환하세요.


    예시 1

    입력:
    numCourses = 2
    prerequisites = [[1, 0]]

    출력:
    [0, 1]


    예시 2

    입력:
    numCourses = 4
    prerequisites = [[1, 0], [2, 0], [3, 1], [3, 2]]

    출력:
    [0, 1, 2, 3]

    설명:
    0번 강의를 먼저 수강해야 1번과 2번 강의를 수강할 수 있고,
    1번과 2번 강의를 모두 수강해야 3번 강의를 수강할 수 있습니다.
    [0, 2, 1, 3]도 올바른 순서입니다.


    예시 3

    입력:
    numCourses = 2
    prerequisites = [[1, 0], [0, 1]]

    출력:
    []


    제한 사항

    1 <= numCourses <= 2000
    0 <= prerequisites.length <= 5000
    prerequisites[i].length == 2
    0 <= course, prerequisite < numCourses
    모든 선수 과목 쌍은 서로 다릅니다.
    */

    public static void main(String[] args) {

        int numCourses = 4;
        int[][] prerequisites = {
                {1, 0},
                {2, 0},
                {3, 1},
                {3, 2}
        };

        int[] result = solution(numCourses, prerequisites);

        System.out.println(Arrays.toString(result)); // [0, 1, 2, 3]
    }

    public static int[] solution(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();
        for (int course = 0; course < numCourses; course++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int previousCourse = prerequisite[1];

            graph.get(previousCourse).add(course);
            indegree[course]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int course = 0; course < numCourses; course++) {
            if (indegree[course] == 0) {
                queue.offer(course);
            }
        }

        int[] order = new int[numCourses];
        int completedCourses = 0;

        while (!queue.isEmpty()) {
            int currentCourse = queue.poll();
            order[completedCourses++] = currentCourse;

            for (int nextCourse : graph.get(currentCourse)) {
                indegree[nextCourse]--;

                if (indegree[nextCourse] == 0) {
                    queue.offer(nextCourse);
                }
            }
        }

        if (completedCourses != numCourses) {
            return new int[0];
        }

        return order;
    }
}
