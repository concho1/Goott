package test;

public class Taxi implements Vehicle{
    @Override
    public void move() {
        System.out.println("택시가 달립니다.");
    }
}
