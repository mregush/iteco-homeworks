package homeworks.factory;

public abstract class Body {

    private String bodyType;

    private String bodyName;

    private String color;

    public Body(String bodyType, String bodyName, String color) {
        this.bodyType = bodyType;
        this.bodyName = bodyName;
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyName() {
        return bodyName;
    }

    public void setBodyName(String bodyName) {
        this.bodyName = bodyName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
