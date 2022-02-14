import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IItem> items;

    public Wallet(String name) {
        this.name = name;
        this.items = new ArrayList<IItem>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.items.size();
    }

    public void addItem(IItem item) {
        this.items.add(item);
    }

}
