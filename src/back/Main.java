package back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // 메인 메소드: 예시 실행
    public static void main(String[] args) {
        int[] people = {1, 2, 3}; // 사람 ID
        int[] products = {10, 20, 30}; // 상품
        List<List<Integer>> permutations = new ArrayList<>();

        generatePermutations(people, products, new ArrayList<>(), permutations, 0);

        // 결과 출력
        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }
    }

    // 중복 순열 생성 메소드
    public static void generatePermutations(int[] people, int[] products, List<Integer> current, List<List<Integer>> result, int index) {
        if (index == people.length) { // 모든 사람이 선택을 마쳤으면 결과에 추가
            result.add(new ArrayList<>(current));
            return;
        }

        for (int product : products) { // 각 사람마다 모든 상품을 선택하는 경우 탐색
            current.add(product); // 현재 사람의 선택 추가
            generatePermutations(people, products, current, result, index + 1); // 다음 사람으로 재귀 호출
            current.remove(current.size() - 1); // 이전 상태로 복귀
        }
    }
}
