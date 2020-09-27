package homeworks.factory.mercedes;

import homeworks.factory.Body;
import homeworks.factory.CarFactory;
import homeworks.factory.Engine;
import homeworks.factory.Interior;

public class MercedesFactory implements CarFactory {

    public Body createBody(String bodyType, String bodyName, String color) {
        return new MercedesBody(bodyType, bodyName, color);
    }

    public Interior createInterior(String interiorName, String interiorColor, String material) {
        return new MercedesInterior(interiorName, interiorColor, material);
    }

    public Engine createEngine(int horsePower, String fuelType) {
        return new MercedesEngine(horsePower, fuelType);
    }
}
