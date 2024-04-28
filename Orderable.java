public interface Orderable {

    void calculateTotal(double price, int quantity);
    void placeOrder(String customerName, String address);
}