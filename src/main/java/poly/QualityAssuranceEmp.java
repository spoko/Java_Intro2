package poly;

import java.util.LinkedList;

public class QualityAssuranceEmp extends Employee implements Manager{
    private boolean hasISTQB;
    public static LinkedList<QualityAssuranceEmp> list;

    public boolean isHasISTQB() {
        return hasISTQB;
    }

    public void setHasISTQB(boolean hasISTQB) {
        this.hasISTQB = hasISTQB;
    }

    public QualityAssuranceEmp(String name, String startDate, double salary, String department, boolean hasISTQB) {
        super(name, startDate, salary, department);
        setHasISTQB(hasISTQB);
        list.add(this);
    }


    public void writingTests(){
        System.out.println(this + " writing tests...");
    }

    @Override
    protected void calculateBonus(boolean hasProjectFinished) {
        //some business logic here for calculating QA`s Bonus
        //number of Test Case created/ executed
        if (hasProjectFinished){
            //add 500 to the bonus
        }
    }

    @Override
    public void supportSomeone() {
        System.out.println("The test cases look great!");
    }

    @Override
    public String giveFeedback() {
        return "This test case is awesome!";
    }

    @Override
    public void fillInPresentSheets() {
        System.out.println("QA manager: fill in data");
    }

    @Override
    protected void setBonus(){
        super.setBonus(); //super gets stuff from the parent
        this.hasISTQB = true;//this gets stuff from the current context (class)
        System.out.println("Bonus is 1500");
    }
}
