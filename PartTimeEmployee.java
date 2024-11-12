public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hours;
    PartTimeEmployee(int id,String name,double hourlyRate,int hours){
        super(id, name);
        this.hourlyRate=hourlyRate;
        this.hours=hours;
    }
    
    @Override
    public double calculateSalary(){
        return hours*hourlyRate;
    }
    
}
