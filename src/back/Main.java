package back;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int n = 3; // n*n 좌표의 크기
        int m = 3; // 뽑을 좌표의 개수
        List<List<int[]>> allCombinations = new ArrayList<>();
        combineCoordinates(n, m, allCombinations, new ArrayList<>(), 0, 0);

        for (List<int[]> combination : allCombinations) {
            for (int[] coord : combination) {
                System.out.print("(" + coord[0] + ", " + coord[1] + ") ");
            }
            System.out.println();
        }
    }

    public static void combineCoordinates(int n, int m, List<List<int[]>> allCombinations, List<int[]> currentCombination, int startX, int startY) {
        if (currentCombination.size() == m) {
            allCombinations.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int x = startX; x < n; x++) {
            for (int y = (x == startX ? startY : 0); y < n; y++) {
                currentCombination.add(new int[]{x, y});
                combineCoordinates(n, m, allCombinations, currentCombination, x + (y + 1) / n, (y + 1) % n);
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }
}
