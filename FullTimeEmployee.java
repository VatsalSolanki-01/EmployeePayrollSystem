public class FullTimeEmployee extends Employee{
    private double monthlySalary;

    FullTimeEmployee(int id,String name,double monthlySalary){
        super(id, name);
        this.monthlySalary=monthlySalary;
    }
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}
