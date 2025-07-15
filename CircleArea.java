class Shape {
    public double getPerimeter() {
        System.out.println("Calculating perimeter in Shape class");
        return 0.0;
    }

    public double getArea() {
        System.out.println("Calculating area in Shape class");
        return 0.0;
    }
}

class Circle extends Shape {

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Circle Perimeter: " + perimeter);
        return perimeter;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
        return area;
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Generic Shape Perimeter: " + shape.getPerimeter());
        System.out.println("Generic Shape Area: " + shape.getArea());

        System.out.println();

        Circle circle = new Circle(5);
        circle.getPerimeter();
        circle.getArea();
    }
}
