public class Computer extends TangibleAsset {
    private String name;
    private int price;
    private String color;
    private String makerName;

    public Computer(String name, int price, String color, String makerName) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.makerName = makerName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * @return the makerName
     */
    public String getMakerName() {
        return this.makerName;
    }
}