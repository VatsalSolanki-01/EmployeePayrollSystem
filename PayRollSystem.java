import java.util.ArrayList;
import java.util.Scanner;

public class PayRollSystem {
    private ArrayList<Employee> employeeList;

    public PayRollSystem(){
        employeeList = new ArrayList<>();
    }
    
    public void createEmployee(Employee employee){
        employeeList.add(employee);                 // Creating a new employee in the list   
    }

    public void removeEmployee(int id){
        Employee toRemoveEmployee = null;           // Deleting an existing employee from the list
        for(Employee i :employeeList){
            if(i.getId()==id){
                toRemoveEmployee=i;
                break;
            }
        }
        if(toRemoveEmployee != null){
            employeeList.remove(toRemoveEmployee);
        }
    }

    public void displayEmployee(){                  // read all the employee details from the list
        for(Employee i:employeeList){
            System.out.println(i);
        }
    }
    
}
