package homeworks.visitor;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {new Rectangle(5, 8), new Square(8, 8), new Triangle(5, 8, 9)};

        Visitor drawVisitor = new ShapeDrawVisitor();

        for (Shape shape : shapes) {
            shape.accept(drawVisitor);
            shape.draw(5, 10);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }
}
