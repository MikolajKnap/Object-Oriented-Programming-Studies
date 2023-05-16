package points;

public class Point2D {
    int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setPoints(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String getPoints(){
        return String.format("%d,%d",x,y);
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
