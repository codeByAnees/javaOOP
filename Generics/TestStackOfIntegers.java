package JavaOOP.Generics;


public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers<Object> stack1 = new StackOfIntegers<>();
        stack1.push("Islamabad");
        stack1.push(2);
        stack1.push("Murree");
        System.out.println(stack1.peek());
        System.out.println(stack1.pop()); 
        System.out.println(stack1.toString());
        StackOfIntegers<Integer> stack2 = new StackOfIntegers<>();
        stack2.push(1);
        stack2.push(3);
        stack2.push(5);
        System.out.println(stack2.peek());
        System.out.println(stack2.pop());
        System.out.println(stack2.toString());
    }
}

