public class Order implements Comparable<Order> {
    private int orderID;
    private String orderDate;
    private double totalAmount;
    private Customer customer;

    public Order(int orderID, String orderDate, double totalAmount, Customer customer) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.customer = customer;
    }

    @Override
    public int compareTo(Order other) {
        return this.orderID - other.orderID; 
    }

    @Override
    public String toString() {
        return "Order{ID=" + orderID + ", date='" + orderDate + "', total=" + totalAmount + 
               ", customer=" + customer + "}";
    }

    public String getOrderDate() {
        return orderDate;
    }
}

