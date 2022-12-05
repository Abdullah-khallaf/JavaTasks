import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of circle: ");
        Double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("The area of circle: " + circle.calculateArea());
        System.out.println("The Circumference of circle: " + circle.calculateCircumference());

        System.out.println("enter the 3 sides of Triangle: ");
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();

        Triangle triangle = new Triangle(a, b, c);
        System.out.println("The area of Triangle is: " + triangle.calculateArea());
        System.out.println("The Circumference of Triangle is: "+ triangle.calculateCircumference());


    }
}