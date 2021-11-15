package JavaOOP.Assignment_2;

public class Test {
    public static void main(String[] args) {
        // Object o1 = new TwoDaysPackage("Anees", "Jhl", "Ali", "ISB", -120.5, 20.6, 300.0);
        // Object o2 = new OvernightPackage("Zain", "LHR", "Asad", "FSD", 229.5, 22.3, 1000.0);
        // if (o1 instanceof TwoDaysPackage) {
        //     System.out.print("Total cost of two day package including flat flee: " + ((TwoDaysPackage)o1).calculateCost());
        // }
        // if (o2 instanceof OvernightPackage) {
        //     System.out.print("\nTotal cost of over night package including additional fee: " + ((OvernightPackage)o2).calculateCost());
        // }
        Object[] o = new Object[5];
        o[0] = new Package("A", "B", "C", "D", 100.0, 15.3);
        o[1] = new OvernightPackage("E", "F", "G", "H", 120.3, 15.3, 500.0);
        o[2] = new OvernightPackage("I", "J", "K", "L", 150.3, 24.3, 1000.0);
        o[3] = new TwoDaysPackage("M", "N", "O", "P", 160.3, 34.1, 200.2);
        o[4] = new TwoDaysPackage("Q", "R", "S", "T", 180.7, 23.9, 303.4);
        display(o);
    }

    public static void display(Object[] o) {
        for (int i = 0; i < o.length; i++) {
            if (o[i] instanceof OvernightPackage) {
                System.out.print("\nOvernight Package: " + ((OvernightPackage)o[i]).calculateCost());
            }
            else if (o[i] instanceof TwoDaysPackage) {
                System.out.print("\nTwoDays Package: " + ((TwoDaysPackage)o[i]).calculateCost());
            }
            else if (o[i] instanceof Package) {
                System.out.print("\nPackage Class: " + ((Package)o[i]).calculateCost());
            }
            else continue;
        }
    }
}
