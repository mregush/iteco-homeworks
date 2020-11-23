package homeworks.visitor;

public abstract class Shape {

    public abstract void draw(int x, int y);

    public abstract String getArea();

    public abstract String getPerimeter();

    public abstract void accept(Visitor visitor);
}
