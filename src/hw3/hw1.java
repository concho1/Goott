package hw3;
import javax.swing.*;
import java.util.*;

import static java.lang.System.exit;

class ProductSearchData{
    HashMap<String, String> productMap;

    ProductSearchData(){
        this.productMap = new HashMap<>();
    }

    void set(String name, String text){
        productMap.put(name,text);
    }
    String get(String name){
        return productMap.get(name);
    }
}
public class hw1 {
    public static void main(String[] args) {
        ProductSearchData pt = new ProductSearchData();
        pt.set("세탁기", "드럼 세탁기 최신형");
        pt.set("냉장고", "지펠 냉장고 최신형");
        pt.set("TV", "HDTV 150인치 최신형 모델");

        JFrame f = new JFrame();
        while(true){
            try{
                String pr = JOptionPane.showInputDialog(f,"검색할 상품을 입력하세요");
                if(pr == null) exit(1);
                String str = pt.get(pr);
                str.length();
                JOptionPane.showMessageDialog(f,str);
            }catch (Exception e){
                JOptionPane.showMessageDialog(f,"해당 상품이 없습니다.");
            }

        }
    }
}
