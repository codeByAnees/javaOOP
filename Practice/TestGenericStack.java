package JavaOOP.Practice;

public class TestGenericStack {
    public static void main(String[] args) {
        GenericStackOfIntegers<Object> stack1 = new GenericStackOfIntegers<>();
        stack1.push("Islamabad");
        stack1.push(2);
        stack1.push("Murree");
        System.out.println(stack1.peek());
        System.out.println(stack1.pop()); 
        System.out.println(stack1.toString());
        GenericStackOfIntegers<Integer> stack2 = new GenericStackOfIntegers<>();
        stack2.push(1);
        stack2.push(3);
        stack2.push(5);
        System.out.println(stack2.peek());
        System.out.println(stack2.pop());
        System.out.println(stack2.toString());
    }
}
