package homeworks.factory.mercedes;

import homeworks.factory.Engine;

public class MercedesEngine extends Engine {

    public MercedesEngine(int horsePower, String fuelType) {
        super(horsePower, fuelType);
    }

    @Override
    public String toString() {
        return "horsePower=" + getHorsePower() +
                ", fuelType='" + getFuelType() + '\'';
    }
}

