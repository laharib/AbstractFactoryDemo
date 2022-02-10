import java.util.Scanner;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        System.out.println("Enter the type of employee. e.g: FullTimeEmployee or Intern");
        String employee= keyboard.nextLine();

        AbstractFactory employeeFactory = FactoryProducer.getFactory(employee);

        System.out.println("Enter the team in which the employee works. e.g: Developer or Tester or HR");
        String employeeTeam= keyboard.nextLine();

        Employee employee1= employeeFactory.getEmployee(employeeTeam);
        employee1.work();
    }
}
