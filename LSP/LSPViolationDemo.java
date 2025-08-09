package LSP;
//  Violates LSP
class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Changes behavior
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height; // Changes behavior
    }
}

public class LSPViolationDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(5);
        rect.setHeight(10);
        System.out.println("Rectangle Area: " + rect.getArea()); // Expected: 50

        Rectangle sq = new Square();
        sq.setWidth(5);
        sq.setHeight(10); // Expected: area = 50, but actual: 100
        System.out.println("Square Area: " + sq.getArea());
    }
}
