import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DeliveryHistory {
    private Map<Order, LocalDateTime> orderHistory = new HashMap<>();

    public void addDelivery(Order order, LocalDateTime time) {
        orderHistory.put(order, time);
    }

    public void showOrderHistory() {
        for (Map.Entry<Order, LocalDateTime> entry : orderHistory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
