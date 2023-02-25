package GeometricFigure;

public class Circle extends GeometricFigure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare () {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
