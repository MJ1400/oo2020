// Item

public class Item {

    private String name;
    private String symbol = "?";
    private ItemType itemType;
    private double weight;
    private int level;
    private int durability;
    public int x;
    public int y;
    public boolean isVisible = true;

    public Item(String name, ItemType itemType, double weight, String symbol) {
        this.name = name;
        this.itemType = itemType;
        this.weight = weight;

        this.level = 0;
        this.durability = 100;
    }

    public Item(int x, int y, String name, ItemType itemType, double weight, String symbol) {
        this.name = name;
        this.itemType = itemType;
        this.weight = weight;
        this.symbol = symbol;

        this.level = 0;
        this.durability = 100;

        this.x = x;
        this.y = y;
    }

    public String toString() {
        return itemType + " named " + name;
    }

    String getSymbol() {
        return this.symbol;
    }

}
