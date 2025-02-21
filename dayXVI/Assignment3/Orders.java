package abhyas.dayXVI.Assignment3;

public class Orders {
    private int orderId;
    private double amount;
    public Orders(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
