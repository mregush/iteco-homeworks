package homeworks.factory;

public abstract class Interior {

    private String interiorName;

    private String interiorColor;

    private String material;

    public Interior(String interiorName, String interiorColor, String material) {
        this.interiorName = interiorName;
        this.interiorColor = interiorColor;
        this.material = material;
    }

    public String getInteriorName() {
        return interiorName;
    }

    public void setInteriorName(String interiorName) {
        this.interiorName = interiorName;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
