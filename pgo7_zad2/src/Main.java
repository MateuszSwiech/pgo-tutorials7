import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1, "Czajnik"));
        items.add(new Item(2, "Patelnia"));
        items.add(new Item(3, "Garnek"));
        items.add(new Item(4, "Talerz"));
        items.add(new Item(5, "Miska"));

        for (Item item : items) {
            item.show();
        }

        HashMap<Integer, String> itemMap = new HashMap<>();

        for (Item item : items) {
            itemMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Nazwa: " + entry.getValue());
        }
    }
}