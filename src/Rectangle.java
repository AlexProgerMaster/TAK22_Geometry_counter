import java.util.Random;
import java.util.Scanner;

public class Rectangle {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    private double sideA = rand.nextDouble() * 9 + 1;
    private double sideB;

    public Rectangle() {}

    public double getArea() {
        return sideA * sideB;
    }

    public double getPerimeter() {
        return (sideA + sideB) * 2;
    }
    public double getSideA() {
        return sideA;
    }
    public double setSideB() {
        System.out.print("Enter the side b: ");
        sideB = scanner.nextDouble();
        return sideB;
    }
}
