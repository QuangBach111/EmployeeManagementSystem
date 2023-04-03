package Entity;

import java.util.*;

public class Department {
    private String departmentName;

    private List<Employee> employees;

    public Department(String departmentName, List<Employee> employees) {
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public Department(String departmentName){
        this.departmentName = departmentName;
        employees = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees.addAll(employees);
    }
    public void setEmployees(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public String toString() {
        return "Entity.Department{" +
                "departmentName='" + departmentName + '\'' +
                "employeeSize=" + this.getEmployees().size() +
                '}';
    }
}
