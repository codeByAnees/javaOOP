package JavaOOP.Interface;

public class Chicken extends Animal implements Edible {
    public String howToEat() {
        return ("Fry it");
    }
    public String sound() {
        return ("Kukrukudoo");
    }
}
