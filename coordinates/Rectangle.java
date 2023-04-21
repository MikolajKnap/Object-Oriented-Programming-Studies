package coordinates;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle() {
        this.bottomLeft = new Point(0,0);
        this.topRight = new Point(1,1);
    }

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public Rectangle(double xleft,double ybottom, double xright, double ytop){
        bottomLeft = new Point(xleft,ybottom);
        topRight = new Point(xright,ytop);
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }
    public double area(){
        double width = topRight.getX() - bottomLeft.getX();
        double height = topRight.getY() - bottomLeft.getY();
        return Math.abs(width*height);
    }

    @Override
    public String toString() {
        return String.format("[(%f,%f),(%f,%f)]",
                bottomLeft.getX(),
                bottomLeft.getY(),
                topRight.getX(),
                topRight.getY());
    }
}
