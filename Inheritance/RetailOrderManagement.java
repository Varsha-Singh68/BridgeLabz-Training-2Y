package inheritance;

class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed. ID: " + orderId + ", Date: " + orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped. ID: " + orderId + ", Date: " + orderDate + ", Tracking Number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered. ID: " + orderId + ", Date: " + orderDate + ", Tracking Number: " + trackingNumber + ", Delivery Date: " + deliveryDate;
    }
}

public class RetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order("O1001", "2025-09-20");
        ShippedOrder shipped = new ShippedOrder("O1002", "2025-09-21", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder("O1003", "2025-09-22", "TRK67890", "2025-09-25");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}

