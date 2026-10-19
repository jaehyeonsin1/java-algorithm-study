package day68;

public class CourseSchedule {

    /*
    [그래프/위상 정렬] 수강 가능 여부

    0번부터 numCourses - 1번까지 총 numCourses개의 강의가 있습니다.

    prerequisites[i] = [course, prerequisite]는
    course 강의를 수강하기 전에 prerequisite 강의를 먼저 수강해야 한다는 뜻입니다.

    모든 강의를 수강할 수 있다면 true를,
    선수 과목 관계에 순환이 있어 모든 강의를 수강할 수 없다면 false를 반환하세요.


    예시 1

    입력:
    numCourses = 2
    prerequisites = [[1, 0]]

    출력:
    true

    설명:
    0번 강의를 수강한 뒤 1번 강의를 수강할 수 있습니다.


    예시 2

    입력:
    numCourses = 2
    prerequisites = [[1, 0], [0, 1]]

    출력:
    false

    설명:
    0번과 1번 강의가 서로를 선수 과목으로 요구하므로
    모든 강의를 수강할 수 없습니다.


    제한 사항

    1 <= numCourses <= 2000
    0 <= prerequisites.length <= 5000
    prerequisites[i].length == 2
    0 <= course, prerequisite < numCourses
    모든 선수 과목 쌍은 서로 다릅니다.
    */

    public static void main(String[] args) {

        int numCourses = 2;
        int[][] prerequisites = {
                {1, 0}
        };

        boolean result = solution(numCourses, prerequisites);

        System.out.println(result); // true
    }

    public static boolean solution(int numCourses, int[][] prerequisites) {

        // TODO: 직접 구현
        return false;
    }
}
