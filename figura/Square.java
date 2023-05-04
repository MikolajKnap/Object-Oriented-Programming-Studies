package figura;

public class Square implements Figure {
    private final double sideLength;
    public Square(double sideLength){
        this.sideLength = sideLength;
    }
    @Override
    public double calculatePerimeter() {
        return sideLength*4;
    }

    @Override
    public double calculateArea() {
        return sideLength*sideLength;
    }
}
