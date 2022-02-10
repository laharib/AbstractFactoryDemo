public class FullTimeEmployeeFactory extends AbstractFactory{
    @Override
    public Employee getEmployee(String employeeType) {
        if(employeeType.equalsIgnoreCase("DEVELOPER")){
            return new DeveloperFTE();
        }
        else if(employeeType.equalsIgnoreCase("TESTER")){
            return new TesterFTE();
        }
        else if(employeeType.equalsIgnoreCase("HR")){
            return new HrFTE();
        }
        return null;
    }
}
