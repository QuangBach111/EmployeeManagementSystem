package Entity;

public class SalariedEmployee extends Employee {
    private double commissionRate;
    private double grossSales;
    private double basicSalary;

    public SalariedEmployee(String ssn, String firstName, String lastName) {
        super(ssn, firstName, lastName);
    }

    public SalariedEmployee() {
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    /*
     *  Find the function to calculate the get payment
     */
    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
