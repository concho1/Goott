package point;

public class Point3D extends Point {
    int z;
    public Point3D(){super();}
    public Point3D(int x, int y){
        super(x,y);
    }
    public Point3D(int x, int y, int z){
        this(x,y);
        this.z = z;
    }
}
