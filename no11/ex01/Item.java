package ex01;

public class Item {
    private String name;
    private int price;
    public Item(String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getprice() {
        return price;
    }
}