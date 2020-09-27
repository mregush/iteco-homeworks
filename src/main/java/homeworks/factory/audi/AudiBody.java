package homeworks.factory.audi;

import homeworks.factory.Body;

public class AudiBody extends Body {

    public AudiBody(String bodyType, String bodyName, String color) {
        super(bodyType, bodyName, color);
    }

    @Override
    public String toString() {
        return "bodyType='" + getBodyType() + '\'' +
                ", bodyName='" + getBodyName() + '\'' +
                ", color='" + getColor() + '\'' ;
    }
}
