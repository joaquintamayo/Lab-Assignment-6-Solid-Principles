public class OrderTest {

    public static void main(String[] args) {

        Orderable order = new OrderAction();
        
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        Generatable generate = new OrderAction();
        generate.generateInvoice("order_123.pdf");

        Sendable send = new NotificationSender();
        send.sendEmailNotification("johndoe@example.com");
    }
}