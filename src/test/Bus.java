package test;

public class Bus implements Vehicle{
    @Override
    public void move() {
        System.out.println("버스가 달립니다.");
    }
}
