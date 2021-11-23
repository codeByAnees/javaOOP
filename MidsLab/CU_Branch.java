package JavaOOP.MidsLab;

public class CU_Branch extends IsbBranch {
    private boolean dineIn;

    public CU_Branch() {
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
