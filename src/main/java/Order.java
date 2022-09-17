import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int numberOfOrders = 0;
    private int orderId;
    private Client client;
    private List<String> items = new ArrayList<>();

    public Order(Client client) {
        numberOfOrders += 1;
        this.orderId = numberOfOrders;
        this.client = client;
    }

    public int getOrderId() {
        return orderId;
    }

    public Client getClient() {
        return client;
    }

    public void addItem(String item) {
        items.add(item);
    };

    public void removeItem(String item) {
        items.remove(item);
    };

    public void clearListOfItems(String item) {
        items.clear();
    };

    public void searchForItem(String item) {
        System.out.println(items.contains(item) ? "Order contains " +
                                                    countItems(item) + " of " + item
                                                    : "There's no " + item);
    }

    private int countItems(String item) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                count +=1;
            }
        }
        return count;
    }

}
