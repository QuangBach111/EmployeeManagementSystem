package Main;

import java.io.*;

import Entity.*;

import java.util.*;

import Service.*;

public class EmployeeManagementSystem {
    public static void main(String[] args) throws FileNotFoundException {


//        boolean isContinue = true;
//        int choice;
//
//
//        // MENU
//        while (isContinue) {
//            System.out.println("===== EMPLOYEE MANAGEMENT SYSTEM ======");
//            System.out.println("1. Add an Salaried employee");
//            System.out.println("2. Add an Hourly employee");
//            System.out.println("3. Display employees");
//            System.out.println("4. Classify employees");
//            System.out.println("5. Search list of employees by department name");
//            System.out.println("6. Search list of employees by name");
//            System.out.println("7. Report");
//            System.out.println("8. Close program");
//            System.out.println();
//            System.out.println("Please choose function you'd like to do:");
//            choice = sc.nextInt();
//            switch (choice) {
//                case 1:
//                    break;
//
//                case 2:
//                    break;
//
//                case 3:
//                    break;
//
//                case 4:
//                    break;
//
//                case 5:
//
//            }
//
//        }
        EmployeeService employeeService = new EmployeeService();
        employeeService.addEmployee(employeeService.createHourlyEmployee());
        employeeService.addEmployee(employeeService.createHourlyEmployee());
        employeeService.addEmployee(employeeService.createHourlyEmployee());

        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\buiqu\\OneDrive\\Máy tính\\fsoft\\6. Java\\homework-java\\JavaAssignment3\\StoredData\\employeeList.txt");
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));

            for(Employee employee : employeeService.getEmployeeList()){
                writer.write(employee.getSsn() + "," + employee.getFirstName() + "," + employee.getLastName() + "," + employee.getBirthDate() + "," + employee.getPhone() + "," + employee.getEmail());
                writer.newLine();
            }

            writer.close();
            fos.close();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
        

    }//end of main
}