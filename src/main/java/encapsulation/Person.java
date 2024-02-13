package encapsulation;

import java.util.LinkedList;

public class Person {
    private String name;
    private int money;
    private LinkedList<Product> bagOfProducts = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("ERROR: Name cannot be empty!");
        }
    }

    public int getMoney() {
        return money;
    }

    private void setMoney(int money) {
        if (money >= 0){
            this.money = money;
        }else {
            System.out.println("ERROR: Money cannot be negative!");
        }
    }

    public Person(String name, int money){
        setName(name);
        setMoney(money);
    }

    public void buyProduct(Product product){
        if (this.money >= product.getCost()){
            bagOfProducts.add(product);
            setMoney(this.money - product.getCost());
            System.out.printf("%s bought %s\n", this.name, product.getName());
        }else {
            System.out.printf("%s can't afford %s\n", this.name, product.getName());
        }
    }

    public void printProducts(){
        if (bagOfProducts.size() == 0){
            System.out.printf("%s - Nothing bought\n", this.name);
            return;
        }

        String itemNames = "";
        for (Product product : bagOfProducts){
            if (bagOfProducts.size() > 1){
                itemNames += product.getName() + ", ";
            }else {
                itemNames += product.getName();
            }
        }
        if (bagOfProducts.size() > 1){
            itemNames = removeLastComa(itemNames);
        }

        System.out.printf("%s - %s\n", this.name, itemNames);
    }

    private String removeLastComa(String input){
        //input = input.trim();
        //input = input.substring(0, input.length() - 2);
        return (input.trim()).substring(0, input.length() - 2);
    }
}
