package test;

public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver();
        Driver d2 = new Driver();

        d1.drive(new Bus());
        d2.drive(new Taxi());
    }
}
