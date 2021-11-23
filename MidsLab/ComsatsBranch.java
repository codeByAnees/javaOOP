package JavaOOP.MidsLab;

public class ComsatsBranch extends IsbBranch {
    private boolean dineIn;

    public ComsatsBranch() {
        super();
        dineIn = false;
    }

    public void placeOrder() {
        super.order();
        for (int i = 0; i < super.flavors.length; i++) {
            super.flavors[i] = super.flavors[i] + " + Chocolate";
        }
    }
}
