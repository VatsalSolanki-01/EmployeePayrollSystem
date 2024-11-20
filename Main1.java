import java.util.ArrayList;
import java.util.Scanner;
public class Main1 {
    
    static Scanner sc = new Scanner(System.in);

    static ArrayList<FullTimeEmployee> fullTimeEmployeeList = new ArrayList<>();

    static ArrayList<PartTimeEmployee> PartTimeEmployeeList = new ArrayList<>();

    
    public static boolean isIdSame(int id){
        boolean result=false;
            for(int i=0;i<fullTimeEmployeeList.size();i++){
                if(fullTimeEmployeeList.get(i).getId()==id){
                    result=true;
                }
                else{
                    result=false;
                }
            }
        return result;
    } 

    public static boolean isIdSame1(int id){
        boolean result=false;
            for(int i=0;i<PartTimeEmployeeList.size();i++){
                if(PartTimeEmployeeList.get(i).getId()==id){
                    result=true;
                }
                else{
                    result=false;
                }
            }
        return result;
    } 

    public static void menu(){
        loop: while(true){
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println(" Welcome to employee Managment System choose any 1 from the below options :-");
                System.out.println("1 ~ Create new Employee record :- ");
                System.out.println("2 ~ Read all Employee record :- ");
                System.out.println("3 ~ Update any of the Employee record :- ");
                System.out.println("4 ~ Delete Employee record :-  ");
                System.out.println("5 ~ MONTHLY EXPENSE ON EMPLOYEES :- ");
                System.out.println("6 ~ Exit");
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                int input = sc.nextInt();
               
                switch(input){
                    case 1:
                        create();
                        break;
                    case 2:
                        if(fullTimeEmployeeList.isEmpty() && PartTimeEmployeeList.isEmpty()){
                            System.out.println("--------------------------------------");
                            System.out.println("no records found, create new records");
                            System.out.println("--------------------------------------");
                        }
                        else{
                        read();
                        }
                        break;
                    case 3:
                        if(fullTimeEmployeeList.isEmpty() && PartTimeEmployeeList.isEmpty()){
                            System.out.println("--------------------------------------");
                            System.out.println("no records found, create new records");
                            System.out.println("--------------------------------------");
                        }
                        else{
                        update();
                        System.out.println("--------------------------------------");
                        System.out.println("record got updated");
                        System.out.println("--------------------------------------");
                        }
                        break;
                    case 4:
                        if(fullTimeEmployeeList.isEmpty()  && PartTimeEmployeeList.isEmpty()){
                            System.out.println("--------------------------------------");
                            System.out.println("no records found, create new records");
                            System.out.println("--------------------------------------");
                        }else{
                        delete();
                        System.out.println("--------------------------------------");
                        System.out.println("record got deleted");
                        System.out.println("--------------------------------------");
                        }
                        break;
                    case 5:
                        monthlyExpense();
                        break;
                    case 6:
                        break loop;
                    default:
                        System.out.println("----------------------------------------------------");
                        System.out.println("no other options choose any one from above given");
                        System.out.println("----------------------------------------------------");
                        break;
            }
        }
    }
    
    public static void create(){
        System.out.println("Enter 1 to create reocrd of Fulltime Employee ");
        System.out.println("Enter 2 to create record of Partime Employee ");
        int input=sc.nextInt();
        switch (input) {
            case 1:
            System.out.print("enter id of Employee :- ");
            int id = sc.nextInt();
            while(isIdSame(id)){
                System.out.print("id already exists enter new id");
                id=sc.nextInt();
            }
            sc.nextLine();
            System.out.print("enter employee name :- ");
            String name=sc.nextLine();
            System.out.print("enter monthly salary of employee :- ");
            int salary=sc.nextInt();
            fullTimeEmployeeList.add(new FullTimeEmployee(id, name, salary));
            break;
            
            case 2:
            System.out.print("enter id of Employee :- ");
            int id1 = sc.nextInt();
            while(isIdSame1(id1)){
                System.out.print("id already exists enter new id");
                id1=sc.nextInt();
            }
            sc.nextLine();
            System.out.print("enter employee name :- ");
            String name1=sc.nextLine();
            System.out.print("enter part-time employee's hourly rate :- ");
            double hourlyRate=sc.nextInt();
            System.out.println("enter daily hours :- ");
            int hours=sc.nextInt();
            PartTimeEmployeeList.add(new PartTimeEmployee(id1, name1, hourlyRate,hours));
            break;
            
            default:
                System.out.println(" only 2 options are available ");
                break;
        }

    }

    public static void read(){
        System.out.println("Enter 1 to read Full time employee list :- ");
        System.out.println("Enter 2 to read Part time employee list :- ");
        int input=sc.nextInt();
        switch (input) {
            case 1:
            for(int i=0;i<fullTimeEmployeeList.size();i++){
                System.out.println("*************************************************************************************");
                System.out.println("Employee id :~ " +fullTimeEmployeeList.get(i).getId()+"Employee Name :~ "+fullTimeEmployeeList.get(i).getName()+" Employee Salary :~ "+fullTimeEmployeeList.get(i).calculateSalary());
                System.out.println("*************************************************************************************");
            }
                break;
            
            case 2:
            for(int i=0;i<PartTimeEmployeeList.size();i++){
                System.out.println("*************************************************************************************");
                System.out.println("Employee id :~ " +PartTimeEmployeeList.get(i).getId()+"Employee Name :~ "+PartTimeEmployeeList.get(i).getName()+" Employee Salary :~ "+PartTimeEmployeeList.get(i).calculateSalary());
                System.out.println("*************************************************************************************");
            }
                break;

            default:
                System.out.println("enter valid input");
                break;
        }
        
    }
    
    public static void update(){
        System.out.println("Enter 1 for updating Fulltime employee ");
        System.out.println("Enter 2 for updating Parttime employee ");
        int input=sc.nextInt();
        switch (input) {
            case 1:
            System.out.println("enter id of employee :- ");
            Integer id = sc.nextInt();
            for(int i =0;i<fullTimeEmployeeList.size();i++){
                if(id.equals(fullTimeEmployeeList.get(i).getId())){
                    System.out.println("enter 1 for updating name and 2 for updating salary of employee :- ");
                    int innerInput = sc.nextInt();
                    switch (innerInput) {
                        case 1:
                            sc.nextLine();
                            System.out.println("enter new Name of the employee :- ");
                            String newName=sc.nextLine();
                            fullTimeEmployeeList.get(i).setName(newName);
                            break;
                        case 2:
                            System.out.println("enter new salary of the employee :- ");
                            double newSalary=sc.nextDouble();
                            fullTimeEmployeeList.get(i).setSalary(newSalary);
                            break;
                        default:
                            System.out.println("only name or salary can be changed");
                            break;
                    }
                }
            }
                break;
            
            case 2:
            System.out.println("enter id of employee :- ");
            Integer id1 = sc.nextInt();
            for(int i =0;i<PartTimeEmployeeList.size();i++){
                if(id1.equals(PartTimeEmployeeList.get(i).getId())){
                    System.out.println("enter 1 for updating name and 2 for updating hourly rate of employee and 3 for no. of hours :- ");
                    int innerinput1 = sc.nextInt();
                    switch (innerinput1) {
                        case 1:
                            sc.nextLine();
                            System.out.println("enter new Name of the employee :- ");
                            String newName=sc.nextLine();
                            PartTimeEmployeeList.get(i).setName(newName);
                            break;
                        case 2:
                            System.out.println("enter new hourly rate of part-time employee :- ");
                            double hourlyRate=sc.nextDouble();
                            PartTimeEmployeeList.get(i).setHourlyRate(hourlyRate);
                            break;
                        
                        case 3: 
                            System.out.println("enter new no. of hours of the part-time employee :- ");
                            int hours=sc.nextInt();
                            PartTimeEmployeeList.get(i).setHours(hours);
    
                        default:
                            System.out.println("only 3 options are available ");
                            break;
                    }
                }
            }
                break;

            default:
                break;
        }

    }
    
    public static void delete(){
        System.out.println("Enter 1 to enter delete Fulltime employee :- ");
        System.out.println("Enter 2 to enter delete Parttime employee :- ");
        int input=sc.nextInt();
        switch (input) {
            case 1:
            System.out.println("enter the employee id to remove the employee :- ");
            int rid = sc.nextInt();
            for(int i =0;i<fullTimeEmployeeList.size();i++){
                if(fullTimeEmployeeList.get(i).getId()==rid){
                    fullTimeEmployeeList.remove(i);
                }
            }
                break;
        
            case 2:
            System.out.println("enter the employee id to remove the employee :- ");
            int rid1 = sc.nextInt();
            for(int i =0;i<PartTimeEmployeeList.size();i++){
                if(PartTimeEmployeeList.get(i).getId()==rid1){
                    PartTimeEmployeeList.remove(i);
                }
            }
            default:
                break;
        } 
        
    }

    public static void monthlyExpense(){
        System.out.println("Enter 1 to get monthly expenses on FullTime employees ");
        System.out.println("Enter 2 to get monthly expenses on PartTime employees ");
        System.out.println("Enter 3 to get monthly expenses on both employees or total expense on Employees ");
        int fulltimeemployeeexpense=0;
        int partTimeEmployeeexpense=0;
        int input=sc.nextInt();
        switch (input) {
            case 1:
                for(int i=0;i<fullTimeEmployeeList.size();i++){
                    fulltimeemployeeexpense+=fullTimeEmployeeList.get(i).calculateSalary();
                }
                System.out.println("Total Monthly expense on FullTimeEmployees are :- "+fulltimeemployeeexpense);
                break;
            case 2:
                for(int i=0;i<fullTimeEmployeeList.size();i++){
                    partTimeEmployeeexpense+=PartTimeEmployeeList.get(i).calculateSalary();
                }
                System.out.println("Total Monthly expense on PartTimeEmployees are :- "+partTimeEmployeeexpense);
                break;
            case 3:
            int totalExpense1=0;
            int totalExpense2=0;
            for(int i=0;i<fullTimeEmployeeList.size();i++){
                totalExpense1+=fullTimeEmployeeList.get(i).calculateSalary();
            }
            for(int i=0;i<fullTimeEmployeeList.size();i++){
                totalExpense2+=PartTimeEmployeeList.get(i).calculateSalary();
            }
            System.out.println("Total Monthly expense on FullTimeEmployees are :- "+(totalExpense1+totalExpense2));
            default:
                break;
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
