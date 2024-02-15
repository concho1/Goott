package hw2;
import java.util.*;
public class Circle implements Shape{
    int r;
    String name;
    Circle(int r){
        this.name = "원";
        this.r = r;
    }
    @Override
    public double findArea() {
        return r*r*Math.PI;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
