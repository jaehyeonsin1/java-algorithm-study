package day48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountsMerge {

    /*
    [그래프/유니온 파인드] 계정 병합

    여러 계정의 정보를 담은 accounts가 주어집니다.

    accounts[i]의 첫 번째 문자열은 계정 소유자의 이름이고,
    나머지 문자열은 해당 계정에 등록된 이메일 주소입니다.

    두 계정에 하나라도 같은 이메일 주소가 있다면 같은 사람의 계정입니다.
    같은 사람의 모든 계정을 하나로 병합하여 반환하세요.

    병합된 각 계정은 이름을 첫 번째 원소로 가지며,
    이메일 주소는 중복 없이 사전순으로 정렬되어야 합니다.

    서로 다른 사람이 같은 이름을 가질 수 있으며,
    결과 계정의 순서는 상관없습니다.


    예시 1

    입력:
    accounts = [
        ["John", "johnsmith@mail.com", "john_newyork@mail.com"],
        ["John", "johnsmith@mail.com", "john00@mail.com"],
        ["Mary", "mary@mail.com"],
        ["John", "johnnybravo@mail.com"]
    ]

    출력:
    [
        ["John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"],
        ["Mary", "mary@mail.com"],
        ["John", "johnnybravo@mail.com"]
    ]

    설명:
    첫 번째와 두 번째 계정은 johnsmith@mail.com을 공유하므로 하나로 병합됩니다.
    네 번째 계정은 이름만 같고 공유하는 이메일이 없으므로 별도 계정입니다.


    예시 2

    입력:
    accounts = [
        ["Alex", "a@mail.com", "b@mail.com"],
        ["Alex", "b@mail.com", "c@mail.com"],
        ["Alex", "d@mail.com"]
    ]

    출력:
    [
        ["Alex", "a@mail.com", "b@mail.com", "c@mail.com"],
        ["Alex", "d@mail.com"]
    ]


    제한 사항

    1 <= accounts.length <= 1000
    2 <= accounts[i].length <= 10
    accounts[i][0]은 영문 이름입니다.
    accounts[i][j]는 올바른 형식의 이메일 주소입니다. (j >= 1)
    한 계정 안에 같은 이메일 주소가 중복되어 등장하지 않습니다.
    */

    public static void main(String[] args) {

        List<List<String>> accounts = new ArrayList<>();
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"));
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"));
        accounts.add(Arrays.asList("Mary", "mary@mail.com"));
        accounts.add(Arrays.asList("John", "johnnybravo@mail.com"));

        List<List<String>> result = solution(accounts);

        System.out.println(result);
        // [[John, john00@mail.com, john_newyork@mail.com, johnsmith@mail.com],
        //  [Mary, mary@mail.com], [John, johnnybravo@mail.com]]
    }

    public static List<List<String>> solution(List<List<String>> accounts) {

        // TODO: 직접 구현
        return new ArrayList<>();
    }
}
