package homeworks.factory.audi;

import homeworks.factory.Body;
import homeworks.factory.CarFactory;
import homeworks.factory.Engine;
import homeworks.factory.Interior;

public class AudiFactory implements CarFactory {


    public Body createBody(String bodyType, String bodyName, String color) {
        return new AudiBody(bodyType, bodyName, color);
    }

    public Interior createInterior(String interiorName, String interiorColor, String material) {
        return new AudiInterior(interiorName, interiorColor, material);
    }

    public Engine createEngine(int horsePower, String fuelType) {
        return new AudiEngine(horsePower, fuelType);
    }

}
