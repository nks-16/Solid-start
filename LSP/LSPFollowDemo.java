package LSP;
//  Follows LSP
interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}

public class LSPFollowDemo {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        Shape sq = new Square(5);

        System.out.println("Rectangle Area: " + rect.getArea()); // 50
        System.out.println("Square Area: " + sq.getArea());       // 25
    }
}