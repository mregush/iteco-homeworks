package homeworks.factory.mercedes;

import homeworks.factory.Interior;

public class MercedesInterior extends Interior {

    public MercedesInterior(String interiorName, String interiorColor, String material) {
        super(interiorName, interiorColor, material);
    }

    @Override
    public String toString() {
        return "interiorName='" + getInteriorName() + '\'' +
                ", interiorColor='" + getInteriorColor() + '\'' +
                ", material='" + getMaterial() + '\'';
    }
}
