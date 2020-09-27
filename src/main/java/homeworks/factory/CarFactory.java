package homeworks.factory;

public interface CarFactory {

    Body createBody(String bodyType, String bodyName, String color);

    Interior createInterior(String interiorName, String interiorColor, String material);

    Engine createEngine(int horsePower, String fuelType);
}
