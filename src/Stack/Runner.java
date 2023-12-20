package Stack;

public class Runner {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.show();
        stack.push(15);
        stack.show();
        stack.push(20);
        stack.show();
        stack.push(25);
        stack.show();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("Size is : " + stack.size());

    }
}

