import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderList implements Iterable<Order> {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public Iterator<Order> iterator() {
        return orders.iterator(); 
    }
}
