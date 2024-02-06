package stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> kitchenDrawer = new Stack<>();

        kitchenDrawer.push("Pan");
        kitchenDrawer.push("Dish");
        kitchenDrawer.push("Fork");

        System.out.println(kitchenDrawer);

        System.out.println("Taking top element:");
        System.out.println(kitchenDrawer.pop());

        System.out.println("Whats left:");
        System.out.println(kitchenDrawer);

        System.out.println("Which is the top element:");
        System.out.println(kitchenDrawer.peek());

        System.out.println("Whats left:");
        System.out.println(kitchenDrawer);

        // this is not a stack operation but can be used since the data structure is a list as well:
        kitchenDrawer.add(1, "Paper");
        System.out.println(kitchenDrawer);
    }
}
