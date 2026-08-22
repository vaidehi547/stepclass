import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Shape shape;

        if (choice == 1) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            shape = new Circle(r);

        } else if (choice == 2) {
            System.out.print("Enter length: ");
            double l = sc.nextDouble();

            System.out.print("Enter width: ");
            double w = sc.nextDouble();

            shape = new Rectangle(l, w);

        } else if (choice == 3) {
            System.out.print("Enter base: ");
            double b = sc.nextDouble();

            System.out.print("Enter height: ");
            double h = sc.nextDouble();

            shape = new Triangle(b, h);

        } else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println("Area = " + shape.calculateArea());
    }
}