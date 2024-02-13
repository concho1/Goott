package hw_6_1_1;
import java.util.*;
class Food{
    String food;
    int cnt;
    int cost;
    private int accumCost;

    Food(String food, int cost, int cnt){
        this.food = food;   this.cnt = cnt;    this.cost = cost;
        this.accumCost = cnt*cost;
    }
    int getAccumCost(){
        return accumCost;
    }
}
class Receipt{
    HashMap<String,Food> m;

    Receipt(){
        m = new HashMap<>();
    }


    void add(String name, int cost, int cnt){
        Food f = new Food(name, cost, cnt);
        m.put(name, f);
    }
    void print(){
        int allCost = 0;
        System.out.println("품명     단가     수량     금액");
        System.out.println("-------------------------------");
        for(String name : m.keySet()){
            Food f = m.get(name);
            allCost += f.getAccumCost();
            System.out.printf("%4s   %,4d    %,d     %,5d원\n",name, f.cost, f.cnt, f.getAccumCost());
        }
        System.out.println("-------------------------------");
        System.out.printf("공급가액                  %,d\n", (int)(allCost/1.1));
        System.out.printf("공급가액                  %,d\n", allCost-(int)(allCost/1.1));
        System.out.println("-------------------------------");
        System.out.printf("청구금액                  %,d\n", allCost);
    }
}
// next()는 엔터를 버퍼에 남겨놓고 문자만 추출함
// 그래서 next() 뒤에 nextLine()을 하게 되면 빈 라인(\n만 있는)이 출력되게 됨
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Receipt receipt = new Receipt();
        System.out.println("품명, 단가, 수량을 입력하세요. \n종료시 \"종료\" 입력");

        while(true){
            String inputStr = sc.nextLine();
            if(inputStr.equals("종료")) break;
            String[] inStrArr = inputStr.trim().split(",");
            receipt.add(inStrArr[0],Integer.parseInt(inStrArr[1]),Integer.parseInt(inStrArr[2]));
        }
        receipt.print();
    }
}
