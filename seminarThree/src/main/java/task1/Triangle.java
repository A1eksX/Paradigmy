package task1;
public class Triangle extends Shape {
    private final double sideOne;
    private final double sideTwo;
    private final double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {

        if ((sideOne + sideTwo <= sideThree) ||       // проверка на наличие треугольника
                (sideOne + sideThree <= sideTwo) ||
                (sideTwo + sideThree <= sideOne)) {
            throw new RuntimeException("Triangle cannot exist");
        }

        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter *
                (halfPerimeter - sideOne) *
                (halfPerimeter - sideTwo) *
                (halfPerimeter - sideThree));
    }

    @Override
    public double getPerimeter() {
        return sideOne + sideTwo + sideThree;
    }
}

//public class Triangle extends Shape{
//    private final double base;
//    private final double heigth;
//    private final int a;
//    private final int b;
//    private final int c;
//
//    public Triangle(double base, double heigth, int a, int b, int c) {
//        this.base = base;
//        this.heigth = heigth;
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }
//
//    @Override
//    public double getArea() {
//        return 0.5 * base * heigth;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return a + b + c;
//    }
//}
