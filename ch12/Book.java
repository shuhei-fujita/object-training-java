public class Book extends TangibleAsset {
    private String name;
    private int price;
    private String color;
    private String isbn;

    // コンストラクタ
    public Book(String name, int price, String color, String isbn) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.isbn = isbn;
    }

    // getterメソッド
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
     * @return the isbn
     */
    public String getIsbn() {
        return this.isbn;
    }
}