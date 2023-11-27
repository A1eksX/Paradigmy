import task1.Circle;
import task1.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());

        Triangle triangle = new Triangle(5, 10, 3);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
    }
}
