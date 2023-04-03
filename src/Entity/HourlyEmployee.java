package Entity;

import Entity.Employee;

import java.util.Date;

public class HourlyEmployee extends Employee {
    private Double wage;
    private Double workingHour;

    public HourlyEmployee() {

    }

    public HourlyEmployee(String ssn, String firstName, String lastName) {
        super(ssn, firstName, lastName);
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    public Double getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(Double workingHour) {
        this.workingHour = workingHour;
    }

    /*
    *  Find the function to calculate the get payment
     */
    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
