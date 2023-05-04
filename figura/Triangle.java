package figura;

public class Triangle implements Figure {
    private final double
            baseLength,
            firstSideLength,
            secondSideLength,
            heightLength;

    public Triangle(double baseLength, double firstSideLength,
                    double secondSideLength, double heightLength) {
        this.baseLength = baseLength;
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
        this.heightLength = heightLength;
    }

    @Override
    public double calculatePerimeter() {
        return baseLength + firstSideLength + secondSideLength;
    }

    @Override
    public double calculateArea() {
        return (0.5 * baseLength * heightLength);
    }
}
