package JavaOOP.Interface;

public class TesterClass {
    public static void main(String[] args) {
        Object o[] = {new Apple(), new Orange(), new Chicken(), new Tiger()};
        for (int i = 0; i < o.length; i++) {
            if (o[i] instanceof Edible) {
                System.out.println(((Edible)o[i]).howToEat());        
            }
            if (o[i] instanceof Animal) {
                System.out.println(((Animal)o[i]).sound());
            }
        }
    }
}
