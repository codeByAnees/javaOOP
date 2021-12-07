package JavaOOP.Generics;

public class Box<T> {
    T t;
    public void add(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
}
