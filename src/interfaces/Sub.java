package interfaces;

public class Sub implements Inter{
    @Override
    public void output1() {
        System.out.println("매서드 재정의");
    }
    @Override
    public void output2() {
        System.out.println("매서드 재정의2");
    }
}
