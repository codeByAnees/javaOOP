package JavaOOP.Assignment_2;

public class OvernightPackage extends Package {
    private double additional_fee;
    public OvernightPackage() {
        super();
        additional_fee = 0.0;
    }

    public OvernightPackage(String senderN, String senderA, String receiverN, String receiverA, double weight, double cost, double additional_fee) {
        super(senderN, senderA, receiverN, receiverA, weight, cost);
        this.additional_fee = additional_fee;
    }

    public double calculateCost() {
        return (super.calculateCost() + additional_fee);
    }
}
