package access2;

import access.Product;

public class Soap extends Product {

    public String getProtectedName(){
        return super.protectedName;//get protected field from a super class outside this package
    }

    public void callProtectedMethod(){
        super.protectedMethod(); //call protected method from a super class outside this package
    }
}
