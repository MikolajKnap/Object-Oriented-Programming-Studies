package points;

public class Point3D extends Point2D{
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void setPoints(int x, int y, int z){
        this.x = x;
        this.y = y;
    }

    @Override
    public String getPoints(){
        return String.format("%d,%d,%d",x,y,z);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
