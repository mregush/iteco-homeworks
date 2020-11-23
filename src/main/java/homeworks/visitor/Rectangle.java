package homeworks.visitor;

public class Rectangle extends Shape {

    private int x;

    private int y;

    public Rectangle() {

    }

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw rectangle with x = " + x + " y = " + y);
    }

    @Override
    public String getArea() {
        return "Area = " + x * y;
    }

    @Override
    public String getPerimeter() {
        return "Perimeter = " + 2 * (x + y);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
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
