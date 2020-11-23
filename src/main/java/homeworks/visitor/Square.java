package homeworks.visitor;

public class Square extends Shape {

    private int x;

    private int y;

    public Square() {

    }

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw square with x = " + x + " y = " + y);
    }

    @Override
    public String getArea() {
        return "Square area = " + x * y;
    }

    @Override
    public String getPerimeter() {
        return "Square perimeter = " + 2 * (x + y);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSquare(this);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
