package arrays;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> randomText = new ArrayList<>();

        randomText.add("Hello world");
        randomText.add("Programing is so fun!");
        randomText.add("Sometimes it is challenging");
        randomText.add("But it is worth it!");

        System.out.println(randomText);

        randomText.add(0, "I am last");

        System.out.println(randomText);

        System.out.println(randomText.remove("I am last"));

        System.out.println(randomText);
    }
}
