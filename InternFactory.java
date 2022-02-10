public class InternFactory extends AbstractFactory{
    public Employee getEmployee(String employeeType) {
        if(employeeType.equalsIgnoreCase("DEVELOPER")){
            return new DeveloperIntern();
        }
        else if(employeeType.equalsIgnoreCase("TESTER")){
            return new TesterIntern();
        }
        return null;
    }
}
