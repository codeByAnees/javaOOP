package JavaOOP.Assignment_3;

public class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice() {
        partNumber = null;
        partDescription = null;
        quantity = 0;
        pricePerItem = 0.0;
    }

    public Invoice(String partN, String des, int quantity, double price) {
        this.partNumber = partN;
        this.partDescription = des;
        this.quantity = quantity;
        this.pricePerItem = price;
    }

    public double getPaymentAmount() {
        return (quantity * pricePerItem);
    }
}
