package hwStream.employee;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Marina",(long)3000);
        Employee emp2 = new Employee("Falco",(long)1000);
        Employee emp3 = new Employee("Maria",(long)2500);
        Employee emp4 = new Employee("Marina",(long)5000);
        Employee emp5 = new Employee("Marina",(long)2000);
        Employee emp6 = new Employee("Roman",(long)2500);
        Employee emp7 = new Employee("Sergey",(long)3200);
        Employee emp8 = new Employee("Angela",(long)1800);
        Employee emp9 = new Employee("Larisa",(long)3000);
        Employee emp10 = new Employee("Petya",(long)3200);
        Employee emp11= new Employee("Roza",(long)2500);
        Employee emp12 = new Employee("Sveta",(long)1299);

        List<Employee> list1 = Arrays.asList(emp1,emp2,emp3);
        List<Employee> list2 = Arrays.asList(emp4,emp5,emp6);
        List<Employee> list3 = Arrays.asList(emp7,emp8,emp9);
        List<Employee> list4 = Arrays.asList(emp10,emp11,emp12);

        Department department1 = new Department("It","111-6",list3);
        Department department2 = new Department("Counting","112-6",list1);
        Department department3 = new Department("Building","111-9",list2);
        Department department4 = new Department("Analytics","111-10",list4);

        List<Department> departments = Arrays.asList(department1,department2,department3,department4);

        System.out.println(DepartmentService.calcNumberOfEmployees(departments,3000));


    }
}
