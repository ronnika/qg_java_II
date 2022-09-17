import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DeliveryService {
    String name;
    OrderQueue orderQueue = new OrderQueue();
    DeliveryHistory deliveryHistory = new DeliveryHistory();
    Set<Client> clients = new HashSet<>();

    public DeliveryService(String name) {
        this.name = name;
    }

    public void addOrder(Order order) {
        orderQueue.addOrder(order);
        clients.add(order.getClient());
    }

    public void startDelivery() {
        while (!orderQueue.isEmpty()) {
            deliver();
        }
    }

    public void listClients() {
        Iterator<Client> iterator = clients.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private void deliver() {
        System.out.println("Delivering");
        deliveryHistory.addDelivery(orderQueue.processFirstOrder(), LocalDateTime.now());
        System.out.println("Delivery is complete");
    }
}
