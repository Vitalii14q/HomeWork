package geometricFigure;


import animal.Dog;

public class Main {

    private static Dog dog = new Dog();
    private static Circle circle = new Circle(1.2);

    public static void main(String[] args) {
        GeometricFigure[] geometricFigures = new GeometricFigure[8]; // это массив всех фигуру.

        geometricFigures[0] = new Circle(2.3); // добавляем в первый элемент массива объект круг с его параметрами и т.д.
        geometricFigures[1] = new Circle(4.3);
        geometricFigures[2] = new Rectangle(4.5, 5.4);
        geometricFigures[3] = new Rectangle(3.1, 2.4);
        geometricFigures[4] = new Square(4.4);
        geometricFigures[5] = new Square(6.5);
        geometricFigures[6] = new Triangle(4.5, 5.4, 6.7);
        geometricFigures[7] = new Triangle(7.5, 8.4, 6.7);

        SquareAndPerimeter squareAndPerimeter = new SquareAndPerimeter();
        squareAndPerimeter.getPerimeter(geometricFigures);
        squareAndPerimeter.getSquare(geometricFigures);
        squareAndPerimeter.getLargestAndSmallestGeometricFigureSquare(geometricFigures);

        //Dog dog = new Dog();
        //Circle circle = new Circle(1.1);
        Object[] object = new Object[2];

        object[0] = dog;
        object[1] = circle;

    /*        A a1 = new A();
        a1.a = "4";
        A a2 = a1;
        a2.a = "3";

        System.out.println(a1);
        System.out.println(a2.a);*/
    }
}
