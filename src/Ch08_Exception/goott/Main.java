package Ch08_Exception.goott;
import javax.swing.*;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"세탁기", "최신형 세탁기"}, {"냉장고", "최신형 냉장고"}, {"세탁기", "최신형 세탁기"}};

        ProductSearchData prMap = new ProductSearchData();
        JFrame f = new JFrame();
        while(true){
            try{
                String pr = JOptionPane.showInputDialog(f,"검색할 상품을 입력하세요");
                if(pr == null) exit(1);
                String str = prMap.search(pr);
                str.length();
                JOptionPane.showMessageDialog(f,str);
            }catch (Exception e){
                JOptionPane.showMessageDialog(f,"해당 상품이 없습니다.");
            }

        }

    }
}
