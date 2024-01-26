package data.types;

public class Test {
    public static void main(String[] args) {
        Variable var1 = new  Variable(); // if we want to access static variable we do not need an object
        Variable var2 = new  Variable();
        Variable.salary = 45; //we can access static variable directly from the class

        System.out.println(Variable.salary); // correct way of accessing static variable
        System.out.println(var1.salary); // not the proper way of accessing static variable
        System.out.println(var2.salary); //it will be the same value since salary is static i.e. has one value for the whole class

        String hello = "Hello world";

        System.out.println(hello.charAt(0));
        System.out.println(hello.length());
        System.out.println(hello.charAt(hello.length() - 1)); // last index of the string
    }
}
