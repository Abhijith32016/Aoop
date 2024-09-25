import java.util.Collections;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Customer customer1 = new Customer("John Doe", "123 Main St");
        Customer customer2 = new Customer("Jane Smith", "456 Oak St");
        Customer clonedCustomer = (Customer) customer1.clone();
        System.out.println("Cloned customer: " + clonedCustomer);
        Order order1 = new Order(101, "2024-01-01", 250.75, customer1);
        Order order2 = new Order(102, "2024-01-05", 100.50, customer2);
        Order order3 = new Order(103, "2024-01-03", 325.00, customer1);
        OrderList orderList = new OrderList();
        orderList.addOrder(order1);
        orderList.addOrder(order2);
        orderList.addOrder(order3);
        Collections.sort(orderList.orders , new OrderByDateComparator());
        System.out.println("Orders sorted by date:");
        for (Order order : orderList) {
            System.out.println(order);
        }
        System.out.println("Iterating over orders:");
        for (Order order : orderList) {
            System.out.println(order);
        }
    }
}
