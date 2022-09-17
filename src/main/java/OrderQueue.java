import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {
    private Queue<Order> queue = new LinkedList<>();

    public void addOrder(Order order) {
        queue.add(order);
    }

    public Order showFirstOrder() {
        return queue.peek();
    }

    public void removeOrder(Order order) {
        queue.remove(order);
    }

    public Order processFirstOrder() {
        return queue.remove();
    }

    public void showOrderQueue() {
        queue.forEach(System.out::println);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
