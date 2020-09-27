package homeworks.factory.mercedes;

import homeworks.factory.Body;

public class MercedesBody extends Body {


    public MercedesBody(String bodyType, String bodyName, String color) {
        super(bodyType, bodyName, color);
    }

    @Override
    public String toString() {
        return "bodyType='" + getBodyType() + '\'' +
                ", bodyName='" + getBodyName() + '\'' +
                ", color='" + getColor() + '\'';
    }

}
