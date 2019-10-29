public abstract class TangibleAsset extends Asset implements Thing {
    private String name;
    private int price;
    private String color;

    public TangibleAsset(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
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
}