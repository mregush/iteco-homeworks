package homeworks.factory.bmw;

import homeworks.factory.Body;

public class BmwBody extends Body {


    public BmwBody(String bodyType, String bodyName, String color) {
        super(bodyType, bodyName, color);
    }

    @Override
    public String toString() {
        return "bodyType='" + getBodyType() + '\'' +
                ", bodyName='" + getBodyName() + '\'' +
                ", color='" + getColor() + '\'' ;
    }
}
