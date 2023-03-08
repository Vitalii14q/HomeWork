package geometricFigure;

public class Triangle extends GeometricFigure{
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle (double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getSquare() {
        double semiPerimeter = (getPerimeter()) / 2;
        return Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC)); // я не смог реализовать метод с корнем самостоятельно.
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}


