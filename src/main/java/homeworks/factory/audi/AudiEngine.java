package homeworks.factory.audi;

import homeworks.factory.Engine;

public class AudiEngine extends Engine {

    public AudiEngine(int horsePower, String fuelType) {
        super(horsePower, fuelType);
    }

    @Override
    public String toString() {
        return "horsePower=" + getHorsePower() +
                ", fuelType='" + getFuelType() + '\'' ;
    }
}
