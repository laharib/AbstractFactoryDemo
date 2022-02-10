public class FactoryProducer {
    public static AbstractFactory getFactory(String employeeType){
        if(employeeType.equalsIgnoreCase("INTERN")){
            return new InternFactory();
        }else{
            return new FullTimeEmployeeFactory();
        }
    }
}
