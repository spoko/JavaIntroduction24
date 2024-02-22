package poly;

import java.sql.SQLOutput;

public abstract class Employee implements Senior {
    private String name;
    private double salary;
    private String startDate;
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus >= 1){
            this.bonus = bonus;
        }else {
            System.out.println("ERROR: Invalid bonus!");
        }
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 933){
            this.salary = salary;
        }else {
            System.out.println("ERROR: Salary cannot be under the minimal wage!");
        }
    }

    public String getStartDate() {
        return startDate;
    }

    private void setStartDate(String startDate) {
        if (!startDate.isEmpty()){
            this.startDate = startDate;
        }else {
            System.out.println("ERROR: Start date cannot be empty!");
        }
    }

    public Employee(String name, String startDate, double salary){
        setName(name);
        setStartDate(startDate);
        setSalary(salary);
    }

    //abstract method in abstract class - the only way!
    protected abstract void calculateBonus();

    //non-abstract method in abstract class
    protected double getSalaryPlusBonus(){
        return this.salary + this.bonus;
    }

    //method overload
    protected double getSalaryPlusBonus(double bonus){
        return this.salary + bonus;
    }
}
