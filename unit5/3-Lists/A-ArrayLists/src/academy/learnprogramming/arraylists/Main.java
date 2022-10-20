package academy.learnprogramming.arraylists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // init a new array lost
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        //   employeeList.forEach(employee -> System.out.println(employee));

        // get second employee
        // System.out.println(employeeList.get(1));

        // check if the employee arrayList is empty
        // System.out.println(employeeList.isEmpty());

        // replace employee at index 2
        employeeList.set(1, new Employee("John", "Adams", 4568));

        // print the items in the list using a lambda expression
        // employeeList.forEach(employee -> System.out.println(employee));

        // number of items
        // System.out.println("There are " + employeeList.size() + " employees");

        // add employee to a specific index
        employeeList.add(3, new Employee("John", "Doe", 4567));
        //employeeList.forEach(employee -> System.out.println(employee));

        // get the actual backing array which will be an object
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeArray) {
            System.out.println(employee);
        }

        // check if employee list contains a specific employee
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));

        // get the index of a specific employee
        System.out.println("John Doe is located at index: " + employeeList.indexOf(new Employee("John", "Doe", 4567)));

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
