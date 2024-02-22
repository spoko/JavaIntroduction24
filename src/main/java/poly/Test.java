package poly;

public class Test {
    public static void main(String[] args) {
        QualityAssuranceEmp qa1 = new QualityAssuranceEmp("Ibro", "neshto si", 2000);

        qa1.calculateBonus();//make bonus 1000 from QAEmp class
        System.out.println(qa1.getSalaryPlusBonus());
        System.out.println(qa1.getSalaryPlusBonus(2000));
    }
}
