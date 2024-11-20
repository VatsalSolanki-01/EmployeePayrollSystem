public class FullTimeEmployee {
    
    private double monthlySalary;
    private int id;
    private String name;

    FullTimeEmployee(int id,String name,double monthlySalary){
        this.id=id;
        this.name=name;
        this.monthlySalary=monthlySalary;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public void setSalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }
    public double calculateSalary(){
        return monthlySalary;
    }
}
