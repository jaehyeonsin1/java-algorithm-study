package day39;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

    /*
    [그래프/위상 정렬] 모든 과목 수강 가능 여부

    0번부터 courseCount - 1번까지 번호가 붙은 과목이 있습니다.
    선수 과목 관계가 담긴 2차원 배열 prerequisites가 주어집니다.

    prerequisites의 각 원소 [course, prerequisite]는
    course를 수강하기 전에 prerequisite를 먼저 수강해야 한다는 뜻입니다.

    모든 과목을 수강할 수 있으면 true를 반환하고,
    선수 과목 관계에 순환이 있어 불가능하면 false를 반환하세요.


    예시 1

    입력:
    courseCount = 2
    prerequisites = [[1, 0]]

    출력:
    true

    설명:
    0번 과목을 수강한 뒤 1번 과목을 수강할 수 있습니다.


    예시 2

    입력:
    courseCount = 2
    prerequisites = [[1, 0], [0, 1]]

    출력:
    false

    설명:
    0번과 1번 과목이 서로를 선수 과목으로 요구하므로
    어떤 과목도 먼저 수강할 수 없습니다.


    예시 3

    입력:
    courseCount = 4
    prerequisites = [[1, 0], [2, 0], [3, 1], [3, 2]]

    출력:
    true


    제한 사항

    1 <= courseCount <= 2,000
    0 <= prerequisites.length <= 5,000
    prerequisites[i].length == 2
    0 <= prerequisites[i][0], prerequisites[i][1] < courseCount
    같은 선수 과목 관계는 중복해서 주어지지 않습니다.
    */

    public static void main(String[] args) {

        int courseCount = 2;
        int[][] prerequisites = {{1, 0}};

        boolean result = solution(courseCount, prerequisites);

        System.out.println(result); // true
    }

    public static boolean solution(int courseCount, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>(courseCount);
        for (int course = 0; course < courseCount; course++) {
            graph.add(new ArrayList<>());
        }

        int[] prerequisiteCount = new int[courseCount];

        for (int[] relation : prerequisites) {
            int course = relation[0];
            int prerequisite = relation[1];

            graph.get(prerequisite).add(course);
            prerequisiteCount[course]++;
        }

        Queue<Integer> availableCourses = new ArrayDeque<>();
        for (int course = 0; course < courseCount; course++) {
            if (prerequisiteCount[course] == 0) {
                availableCourses.offer(course);
            }
        }

        int completedCourseCount = 0;

        while (!availableCourses.isEmpty()) {
            int completedCourse = availableCourses.poll();
            completedCourseCount++;

            for (int nextCourse : graph.get(completedCourse)) {
                prerequisiteCount[nextCourse]--;

                if (prerequisiteCount[nextCourse] == 0) {
                    availableCourses.offer(nextCourse);
                }
            }
        }

        return completedCourseCount == courseCount;
    }
}
