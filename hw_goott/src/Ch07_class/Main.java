package Ch07_class;
public class Main {
    public static void main(String[] args) {
        //String color, boolean onOff, int ch
        Tv tv1 = new Tv("흰색", false, 18);
        tv1.display();
        tv1.rePlace("검정색", true, 25);
        tv1.display();
        for(int i=0; i<10; i++) tv1.chUp();
        tv1.display();
    }
}
