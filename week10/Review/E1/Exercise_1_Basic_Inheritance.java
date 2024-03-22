package week10.Review.E1;

import java.util.Scanner;

public class Exercise_1_Basic_Inheritance {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Whats the radius of the circle (CM): ");
        circle.setRadius(scanner.nextDouble());
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The Perimeter of the circle is: " + circle.getPerimeter());

        System.out.print("Whats the Length of the Rectangle (CM): ");
        rectangle.setLength(scanner.nextDouble());
        System.out.print("Whats the width of the rectangle (CM): ");
        rectangle.setWidth(scanner.nextDouble());
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter());
        scanner.close();
    }
}
