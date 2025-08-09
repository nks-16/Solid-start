package OCP;
// Violates OCP: We have to edit this class for new shapes
class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return Math.PI * c.radius * c.radius;
        } 
        else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.length * r.width;
        }
        // If tomorrow we add Triangle → we must modify this class again
        return 0;
    }
}

class Circle {
    double radius;
    Circle(double radius) { this.radius = radius; }
}

class Rectangle {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

public class OCPViolationDemo {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Circle Area: " + calculator.calculateArea(new Circle(5)));
        System.out.println("Rectangle Area: " + calculator.calculateArea(new Rectangle(4, 6)));
    }
}
