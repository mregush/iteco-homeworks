package homeworks.factory.lada;

import homeworks.factory.Body;
import homeworks.factory.CarFactory;
import homeworks.factory.Engine;
import homeworks.factory.Interior;

public class LadaFactory implements CarFactory {

    public Body createBody(String bodyType, String bodyName, String color) {
        return new LadaBody(bodyType, bodyName, color);
    }

    public Interior createInterior(String interiorName, String interiorColor, String material) {
        return new LadaInterior(interiorName, interiorColor, material);
    }

    public Engine createEngine(int horsePower, String fuelType) {
        return new LadaEngine(horsePower, fuelType);
    }
}
