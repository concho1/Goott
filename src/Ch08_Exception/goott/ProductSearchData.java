package Ch08_Exception.goott;
import java.util.*;
public class ProductSearchData {
    HashMap<String,String> productMap;
    ProductSearchData(){
        this.productMap = new HashMap<>();
        this.productMap.put("세탁기", "드럼 세탁기 최신형");
        this.productMap.put("냉장고", "지펠 냉장고 최신형");
        this.productMap.put("TV", "HDTV 150인치 최신 모델");
        this.productMap.put("김치냉장고", "지펠 김치 냉장고 최신형");
        this.productMap.put("건조기", "드럼 건조기 최신형");
        this.productMap.put("스타일러", "스타일러 최신형");
    }

    String search(String name) throws Exception{
        return this.productMap.get(name);

    }
}
