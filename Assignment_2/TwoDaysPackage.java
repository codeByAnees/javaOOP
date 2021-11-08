package JavaOOP.Assignment_2;

public class TwoDaysPackage extends Package {
    private double flatFee;
    public TwoDaysPackage() {
        super();
        flatFee = 0.0;
    }

    public TwoDaysPackage(String senderN, String senderA, String receiverN, String receiverA, double weight, double cost, double flatFee) {
        super(senderN, senderA, receiverN, receiverA, weight, cost);
        this.flatFee = flatFee;
    }

    public double calculateCost() {
        return (super.calculateCost() + flatFee);
    }
}
