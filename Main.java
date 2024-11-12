public class Main {
    public static void main(String[] args) {
    PayRollSystem payrollsystem = new PayRollSystem();
    FullTimeEmployee emp1 = new FullTimeEmployee(1, "john", 70000);
    FullTimeEmployee emp2 = new FullTimeEmployee(2,"drake",45000);
    PartTimeEmployee emp3 = new PartTimeEmployee(3, "lee", 4000, 5);
    
    payrollsystem.createEmployee(emp1);
    payrollsystem.createEmployee(emp2);
    payrollsystem.createEmployee(emp3);
    payrollsystem.displayEmployee();
    payrollsystem.removeEmployee(3);
    System.out.println("employee details aftere removing an employee :-");
    payrollsystem.displayEmployee();
    }
}
