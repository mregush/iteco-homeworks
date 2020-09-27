package homeworks.factory.audi;

import homeworks.factory.Interior;

public class AudiInterior extends Interior {

    public AudiInterior(String interiorName, String interiorColor, String material) {
        super(interiorName, interiorColor, material);
    }

    @Override
    public String toString() {
        return "interiorName='" + getInteriorName() + '\'' +
                ", interiorColor='" + getInteriorColor() + '\'' +
                ", material='" + getMaterial() + '\'' ;
    }
}
