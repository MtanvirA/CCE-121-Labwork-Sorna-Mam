class Shape {
    double getPerimeter() {
        System.out.println("Calculating perimeter in Shape class");
        return 0.0;
    }

    double getArea() {
        System.out.println("Calculating area in Shape class");
        return 0.0;
    }
}

class Circle extends Shape {
    double radius=5;
    
    double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Generic Shape Perimeter: " + shape.getPerimeter());
        System.out.println("Generic Shape Area: " + shape.getArea());

        System.out.println();

        Circle circle= new Circle();

        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());

    }
}
