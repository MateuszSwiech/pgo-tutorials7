public class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println("Item ID: " + id + ", Name: " + name);
    }


}
