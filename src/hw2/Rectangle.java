package hw2;

public class Rectangle implements Shape{
    int c;
    int r;
    String name;
    Rectangle(int c, int r){
        this.name = "사각형";
        this.c = c;
        this.r = r;
    }
    @Override
    public double findArea() {
        return c*r;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
