package homeworks.factory.bmw;

import homeworks.factory.Body;
import homeworks.factory.CarFactory;
import homeworks.factory.Engine;
import homeworks.factory.Interior;

public class BmwFactory implements CarFactory {

    public Body createBody(String bodyType, String bodyName, String color) {
        return new BmwBody(bodyType, bodyName, color);
    }

    public Interior createInterior(String interiorName, String interiorColor, String material) {
        return new BmwInterior(interiorName, interiorColor, material);
    }

    public Engine createEngine(int horsePower, String fuelType) {
        return new BmwEngine(horsePower, fuelType);
    }
}
