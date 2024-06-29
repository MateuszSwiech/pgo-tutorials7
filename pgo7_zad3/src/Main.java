import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            items.add(new Item(i, "Item" + i));
        }

        List<Item> firstFiveItems = items.subList(0, 5);

        HashSet<Item> itemSet = new HashSet<>(firstFiveItems);

        itemSet.forEach(Item::show);
    }}
