package homeworks.factory.lada;

import homeworks.factory.Body;

public class LadaBody extends Body {

    public LadaBody(String bodyType, String bodyName, String color) {
        super(bodyType, bodyName, color);
    }

    @Override
    public String toString() {
        return "bodyType='" + getBodyType() + '\'' +
                ", bodyName='" + getBodyName() + '\'' +
                ", color='" + getColor() + '\'' ;
    }
}
