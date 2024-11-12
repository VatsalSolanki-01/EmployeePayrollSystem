abstract class Employee{
    private int id;
    private String name;

    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public abstract double calculateSalary();

    @Override
    public String toString(){
        return "Employee {name :- "+name+", id :- "+id+", salary :- "+calculateSalary()+" }";
    }
}