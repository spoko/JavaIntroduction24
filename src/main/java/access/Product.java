package access;

public class Product {
    //can be accessed from any class in any package
    public String publicName;
    //class in this package; and subclass in different package (inheritance)
    protected String protectedName;
    //can be access only from classes in this package
    String defName;
    //only from the current (this) class
    private String privateName;

    public final String factory;// = "Zavod 1";

    public Product(){
        factory = "Zavod 5 ";
    }

    private void privateMethod(){
        System.out.println("Calling private method");
    }

    void defaultMethod(){
        System.out.println("Calling default method");
        //factory = "Zavod 3"; - not possible to change the value of final variable i.e. constant
    }

    protected void protectedMethod(){
        System.out.println("Calling protected method");
    }

    public void publicMethod(){
        System.out.println("Calling public method");
    }

}
