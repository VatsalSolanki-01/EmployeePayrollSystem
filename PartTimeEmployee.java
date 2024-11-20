public class PartTimeEmployee {
    private int id;
    private String name;
    private double hourlyRate;
    private int hours;
    PartTimeEmployee(int id,String name,double hourlyRate,int hours){
        this.id=id;
        this.name=name;
        this.hourlyRate=hourlyRate;
        this.hours=hours;
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

    public void setHourlyRate(double hourlyRate){
        this.hourlyRate=hourlyRate;
    }

    public void setHours(int hours){
        this.hours=hours;
    }
    
    public double calculateSalary(){
        return hours*hourlyRate*20;
    }
    
}
