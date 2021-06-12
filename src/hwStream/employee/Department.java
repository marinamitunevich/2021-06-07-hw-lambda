package hwStream.employee;

import java.util.List;

public class Department {
    private String name;
    private String code;
    private List<Employee> listOfEmployee;

    public Department(String name, String code, List<Employee> listOfEmployee) {
        this.name = name;
        this.code = code;
        this.listOfEmployee = listOfEmployee;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Employee> getListOfEmployee() {
        return listOfEmployee;
    }
}
