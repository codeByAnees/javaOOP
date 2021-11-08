package JavaOOP.Assignment_2;

public class Test {
    public static void main(String[] args) {
        Object o1 = new TwoDaysPackage("Anees", "Jhl", "Ali", "ISB", -120.5, 20.6, 300.0);
        Object o2 = new OvernightPackage("Zain", "LHR", "Asad", "FSD", 229.5, 22.3, 1000.0);
        if (o1 instanceof TwoDaysPackage) {
            System.out.print("Total cost of two day package including flat flee: " + ((TwoDaysPackage)o1).calculateCost());
        }
        if (o2 instanceof OvernightPackage) {
            System.out.print("\nTotal cost of over night package including additional fee: " + ((OvernightPackage)o2).calculateCost());
        }
    }
}
