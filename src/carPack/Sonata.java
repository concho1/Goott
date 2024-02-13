package carPack;

public class Sonata extends Car{
    Sonata(String col, int price){
        this.name = "쏘나타";
        this.col = col;
        this.price = price;
    }
    void print(){

        System.out.println("모델명 : "+this.name);
        System.out.println("색상 : "+this.col);
        System.out.println("가격 : "+this.price);
    }
}
