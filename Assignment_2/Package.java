package JavaOOP.Assignment_2;

public class Package {
    private String senderName;
    private String senderAddress;
    private String receiverName;
    private String receiverAddress;
    private double weightInKG;
    private double costPerKG;

    public Package() {
        senderName = null;
        senderAddress = null;
        receiverName = null;
        receiverAddress = null;
        weightInKG = 0.0;
        costPerKG = 0.0;
    }

    public Package(String senderN, String senderA, String receiverN, String receiverA, double weight, double cost) {
        this.senderName = senderN;
        this.senderAddress = senderA;
        this.receiverName = receiverN;
        this.receiverAddress = receiverA;
        this.weightInKG = weight;
        this.costPerKG = cost;
    }

    public double calculateCost() {
        if (weightInKG < 0 && costPerKG < 0){
            weightInKG *= -1;
            costPerKG *= -1;
        }
        else if (weightInKG < 0) {
            weightInKG *= -1;
        }
        else if (costPerKG < 0) {
            costPerKG *= -1;
        }
        return weightInKG * costPerKG;
    }
}
