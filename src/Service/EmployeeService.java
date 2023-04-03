package Service;

import Entity.Employee;
import Entity.HourlyEmployee;
import Entity.SalariedEmployee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();
    private String fileName = "C:\\Users\\buiqu\\OneDrive\\Máy tính\\fsoft\\6. Java\\homework-java\\JavaAssignment3\\StoredData\\employeeList.txt";
    Scanner sc = new Scanner(System.in);


    public EmployeeService() {
        this.employeeList = new ArrayList<>();
    }

    public EmployeeService(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public EmployeeService(List<Employee> employeeList, String fileName) {
        this.employeeList = employeeList;
        this.fileName = fileName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

//    public void loadEmployeeListFromFile(){
//        try{
//            BufferedReader reader = new BufferedReader(new FileReader(fileName));
//
//            String line;
//
//            while ((line = reader.readLine()) != null){
//                String data[] = line.split(",");
//
//                employee.setSsn(data[0]);
//                employee.setFirstName(data[1]);
//                employee.setLastName(data[2]);
//                employee.setBirthDate(data[3]);
//                employee.setPhone(data[4]);
//                employee.setEmail(data[5]);
//                employeeList.add(employee);
//
//            }
//        }catch (IOException e){
//            System.out.println(e);
//        }
//    }
    public SalariedEmployee addSalariedEmployee() {
        SalariedEmployee employee = new SalariedEmployee() ;

        System.out.println("Enter information of Salaried employee: ");

        System.out.println("Input ssn: ");
        employee.setSsn(sc.next());

        System.out.println("Input firstName: ");
        employee.setFirstName(sc.next());

        System.out.println("Input lastName: ");
        employee.setLastName(sc.next());

        System.out.println("Input birthdate: ");
        employee.setBirthDate(sc.next());

        System.out.println("Input phone: ");
        employee.setPhone(sc.next());

        System.out.println("Input email: ");
        employee.setEmail(sc.next());
        System.out.println("Input commissionRate: ");
        employee.setCommissionRate(sc.nextDouble());

        System.out.println("Input grossSales: ");
        employee.setGrossSales(sc.nextDouble());

        System.out.println("Input basicSalary: ");
        employee.setBasicSalary(sc.nextDouble());

        sc.nextLine();

        return employee;
    }

    public void addHourlyEmployee() {
        HourlyEmployee employee = new HourlyEmployee() ;

        System.out.println();
        System.out.println("Enter information of Hourly employee: ");

        System.out.println("Input ssn: ");
        employee.setSsn(sc.nextLine());

        System.out.println("Input firstName: ");
        employee.setFirstName(sc.nextLine());

        System.out.println("Input lastName: ");
        employee.setLastName(sc.nextLine());

        System.out.println("Input birthdate: ");
        employee.setBirthDate(sc.nextLine());

        System.out.println("Input phone: ");
        employee.setPhone(sc.nextLine());

        System.out.println("Input email: ");
        employee.setEmail(sc.nextLine());

        System.out.println("Input wage: ");
        employee.setWage(sc.nextDouble());

        System.out.println("Input workingHours: ");
        employee.setWorkingHour(sc.nextDouble());

        sc.nextLine();

    }

    public void addEmployee(Employee employee){
        this.employeeList.add(employee);
    }

    public List<Employee> searchByEmpName(String empName){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < this.employeeList.size(); i++) {
            String fullName = this.employeeList.get(i).getFirstName() + " " + this.employeeList.get(i).getLastName();

            if(fullName.equals(empName)){
                employees.add(this.employeeList.get(i));
            }

        }
        return employees;
    }
}
