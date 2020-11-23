package homeworks.visitor;

public class ShapeDrawVisitor extends Visitor {

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("Draw 3D rectangle");
    }

    @Override
    public void visitSquare(Square square) {
        System.out.println("Draw 3D square");
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        System.out.println("Draw 3D triangle");
    }
}
