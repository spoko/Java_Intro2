package poly;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        DeveloperEmp dev1 = new DeveloperEmp("Devcho", "01.01.2020", 4564.0, "IT",
                "Java");
        System.out.println(dev1.getDepartment());
        System.out.println(dev1.getName());
        System.out.println(dev1.getSalary(Roles.Developer)); //will return -1
        System.out.println(dev1.getSalary(Roles.Accountant));
        System.out.println(dev1.getStartDate());
        System.out.println(dev1.getProgramingLanguage());//this is specific for developers only

        QualityAssuranceEmp qa1 = new QualityAssuranceEmp("Testercho", "01.01.01",
                5464, "QA", true);

        //dev1.fillInPresentSheets();
        qa1.fillInPresentSheets();


        //Employee employee = new Employee("fds", "342",3434,"342"); //we cannot create object from abstract class

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(dev1);
        employees.add(qa1);
       // System.out.println(QualityAssuranceEmp.list);

        dev1.setBonus();
        dev1.setBonus(666.0);

        qa1.setBonus();

    }
}
