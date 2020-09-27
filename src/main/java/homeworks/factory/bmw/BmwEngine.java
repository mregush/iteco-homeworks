package homeworks.factory.bmw;

import homeworks.factory.Engine;

public class BmwEngine extends Engine {


    public BmwEngine(int horsePower, String fuelType) {
        super(horsePower, fuelType);
    }

    @Override
    public String toString() {
        return "horsePower=" + getHorsePower() +
                ", fuelType='" + getFuelType() + '\'';
    }
}
