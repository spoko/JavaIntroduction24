package poly;

public class QualityAssuranceEmp extends Employee{
    private boolean isAutomation;
    private boolean hasISTQB;

    //constructor
    public QualityAssuranceEmp(String name, String startDate, double salary, boolean isAutomation,
                               boolean hasISTQB) {
        super(name, startDate, salary);
        this.isAutomation = isAutomation;
        this.hasISTQB = hasISTQB;
    }
    public QualityAssuranceEmp(String name, String startDate, double salary) {
        super(name, startDate, salary);
    }

    //method override
    @Override
    protected void calculateBonus() {
        super.setBonus(1000);
    }

    //methods i.e. actions that this object can do:
    public void takeISTQBExam(boolean isSuccessful){
        hasISTQB = isSuccessful;
    }

    public void takeAutomationCourse(boolean isSuccessful){
        isAutomation = isSuccessful;
    }

    public void writingTests(){
        System.out.println(super.getName() + " writing test cases...");
    }

    @Override
    public void helpOthers() {
        System.out.println("I am helping with writing test cases");
    }

    @Override
    public String giveFeedback() {
        return "You are doing great!";
    }
}
