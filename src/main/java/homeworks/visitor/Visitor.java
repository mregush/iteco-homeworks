package homeworks.visitor;

public abstract class Visitor {

    public abstract void visitRectangle(Rectangle rectangle);

    public abstract void visitSquare(Square square);

    public abstract void visitTriangle(Triangle triangle);

}
