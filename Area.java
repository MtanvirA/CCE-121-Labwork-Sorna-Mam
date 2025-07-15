class Shape {
    double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    double length = 5;
    double width = 3;
    double getArea() {
        return length * width;
    }
}

public class Area {
    public static void main(String[] args) {
        Shape shape = new Shape();  // Base shape
        Rectangle rect = new Rectangle();

        System.out.println("Generic shape area: " + shape.getArea());
        System.out.println("Rectangle area: " + rect.getArea());
    }
}
