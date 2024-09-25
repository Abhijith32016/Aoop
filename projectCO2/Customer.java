public class Customer implements Cloneable {
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', address='" + address + "'}";
    }
}
