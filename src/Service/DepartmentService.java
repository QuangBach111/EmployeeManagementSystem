package Service;

import Entity.Department;
import Entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {
    private List<Department> departmentList;

    public DepartmentSerice(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public DepartmentService(){
        departmentList = new ArrayList<>();
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public List<Employee> searchByDepartmentName(String departmentName){
        for (int i = 0; i < this.departmentList.size(); i++) {
            Department currentDepartment = this.departmentList.get(i);

            if(currentDepartment.getDepartmentName()
                    .equals(departmentName)){

                return this.departmentList.get(i).getEmployees();
            }
        }

        return null;
    }


}
