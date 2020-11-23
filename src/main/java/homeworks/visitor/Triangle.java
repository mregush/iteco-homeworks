package homeworks.visitor;

public class Triangle extends Shape {

    private int x;

    private int y;

    private int z;

    public Triangle() {

    }

    public Triangle(int z) {
        this.z = z;
    }

    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw triangle with x = " + x + " y = " + y + " z = " + z);
    }

    @Override
    public String getArea() {
        int area = x + y + z;
        return "Area triangle = " + area;
    }

    @Override
    public String getPerimeter() {
        int perimeter = x + y + z;
        return "Perimeter triangle " + perimeter;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTriangle(this);
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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
