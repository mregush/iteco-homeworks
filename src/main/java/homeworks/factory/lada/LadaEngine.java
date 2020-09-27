package homeworks.factory.lada;

import homeworks.factory.Engine;

public class LadaEngine extends Engine {

    public LadaEngine(int horsePower, String fuelType) {
        super(horsePower, fuelType);
    }

    @Override
    public String toString() {
        return "horsePower=" + getHorsePower() +
                ", fuelType='" + getFuelType() + '\'';
    }
}
