package homeworks.factory.bmw;

import homeworks.factory.Interior;

public class BmwInterior extends Interior {


    public BmwInterior(String interiorName, String interiorColor, String material) {
        super(interiorName, interiorColor, material);
    }

    @Override
    public String toString() {
        return "interiorName='" + getInteriorName() + '\'' +
                ", interiorColor='" + getInteriorColor() + '\'' +
                ", material='" + getMaterial() + '\'';
    }
}
