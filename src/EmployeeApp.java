
//I imported these classes because I'll be using them
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EmployeeApp

{
    public static void main(String[] args) {
        // I first created 3 objects holding each arg from the employees to save on
        // code.
        Employee firstObj = new Employee("Susan Meyers", 47899, "Accounting", " Vice President ");
        Employee secondObj = new Employee("Mark Jones", 39119, "IT", "Programmer ");
        Employee thirdObj = new Employee("Joy Rogers", 81774, "Manufacturing", " Engineer ");

        // I created a collection of arrays that will hold all that
        // is inside the objects.
        Collection<Employee> objArray = new ArrayList<Employee>();
        Collections.addAll(objArray, firstObj, secondObj, thirdObj);

        int i = 1;// I inizialized a variable to use on my enhanced for loop.

        for (Employee employee : objArray) // Using a For loop to loop thru
                                           // each object and get each needed
                                           // method to display on screen.
        {
            System.out.println("Employee " + i);
            System.out.println("Name: " + employee.getName());
            System.out.println("ID Number: " + employee.getIdNumber());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Position: " + employee.getPosition());
            i++;
        }

    }

}
