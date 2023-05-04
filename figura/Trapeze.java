package figura;

public class Trapeze implements Figure {

    private final double
            shorterBaseLength,
            longerBaseLength,
            shorterSideLength,
            longerSideLength,
            heightLength;

    public Trapeze(double shorterBaseLength, double longerBaseLength,
                   double shorterSideLength, double longerSideLength,
                   double heightLength) {
        this.shorterBaseLength = shorterBaseLength;
        this.longerBaseLength = longerBaseLength;
        this.shorterSideLength = shorterSideLength;
        this.longerSideLength = longerSideLength;
        this.heightLength = heightLength;
    }

    @Override
    public double calculatePerimeter() {
        return shorterBaseLength + longerBaseLength + shorterSideLength + longerSideLength;
    }

    @Override
    public double calculateArea() {
        return (0.5 * (shorterBaseLength + longerBaseLength) * heightLength);
    }
}
