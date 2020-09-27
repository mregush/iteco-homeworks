package homeworks.factory.lada;

import homeworks.factory.Interior;

public class LadaInterior extends Interior {

    public LadaInterior(String interiorName, String interiorColor, String material) {
        super(interiorName, interiorColor, material);
    }

    @Override
    public String toString() {
        return "interiorName='" + getInteriorName() + '\'' +
                ", interiorColor='" + getInteriorColor() + '\'' +
                ", material='" + getMaterial() + '\'';
    }
}
