package GeometricFigure;

public class SquareAndPerimeter {

    public void getSquare(GeometricFigure[] geometricFigures) {
        double totalSquare = 0.0;

        for (int i = 0; i < geometricFigures.length; i++) {
            GeometricFigure geometricFigure = geometricFigures[i];  // объявляем переменную типа GeometricFigure и инициализируем ее i элементом geometricFigure массива
            totalSquare += geometricFigure.getSquare(); // считаем через цикл сумму всех площадей
            System.out.println("Square: " + geometricFigure.getSquare());
        }
        System.out.println("Total square: " + totalSquare);
    }

    public void getPerimeter(GeometricFigure[] geometricFigures) {
        double totalPerimeter = 0.0;

        for (int i = 0; i < geometricFigures.length; i++) {
            GeometricFigure geometricFigure = geometricFigures[i];
            totalPerimeter += geometricFigure.getPerimeter();
            System.out.println("Perimeter: " + geometricFigure.getPerimeter());
        }
        System.out.println("Total perimeter: " + totalPerimeter);
    }

    public void getLargestAndSmallestGeometricFigureSquare (GeometricFigure[] geometricFigures) {
        GeometricFigure largestGeometricFigureSquare = geometricFigures[0];
        GeometricFigure smallestGeometricFigureSquare = geometricFigures[0];
        GeometricFigure largestGeometricFigurePerimeter = geometricFigures[0];
        GeometricFigure smallestGeometricFigurePerimeter = geometricFigures[0];

        for (int i = 1; i < geometricFigures.length; i++) {
            GeometricFigure geometricFigure = geometricFigures[i];
            if (geometricFigure.getSquare() > largestGeometricFigureSquare.getSquare()) {
                largestGeometricFigureSquare = geometricFigure;
            }
            if (geometricFigure.getSquare() < smallestGeometricFigureSquare.getSquare()) {
                smallestGeometricFigureSquare = geometricFigure;
            }
            if (geometricFigure.getPerimeter() > largestGeometricFigurePerimeter.getPerimeter()) {
                largestGeometricFigurePerimeter = geometricFigure;
            }
            if (geometricFigure.getPerimeter() < smallestGeometricFigurePerimeter.getPerimeter()) {
                smallestGeometricFigurePerimeter = geometricFigure;
            }
        }
        System.out.println("Largest geometric figure by square: " + largestGeometricFigureSquare);
        System.out.println("Smallest geometric figure by square: " + smallestGeometricFigureSquare);
        System.out.println("Largest geometric figure by perimeter: " + largestGeometricFigurePerimeter);
        System.out.println("Smallest geometric figure by perimeter: " + smallestGeometricFigurePerimeter);
    }
}
