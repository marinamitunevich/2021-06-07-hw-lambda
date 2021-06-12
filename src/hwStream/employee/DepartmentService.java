package hwStream.employee;

import java.util.List;

public class DepartmentService {
   public static long calcNumberOfEmployees(List<Department> departmentList, long threshold){
      long amountOfEmployees = departmentList.stream().filter(department -> department.getCode().contains("111"))
              .flatMap(list -> list.getListOfEmployee().stream())
              .filter(employee -> employee.getSalary() > threshold).count();

      return amountOfEmployees;

   }
}

