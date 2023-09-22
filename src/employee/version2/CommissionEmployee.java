/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;

/**
 *
 * @author User
 */
public class CommissionEmployee extends Employee{
    private double totalSales;
    
    //3 constructors

    public CommissionEmployee() {
    }

    public CommissionEmployee(String empName, String BirthDate) {
        super(empName, BirthDate);
    }

    public CommissionEmployee(int empID, String empName, String DateHired, String BirthDate, double totalSales) {
        super(empID, empName, DateHired, BirthDate);
        this.totalSales = totalSales;
    }

    public CommissionEmployee(int empID, String empName, String DateHired, String BirthDate) {
        super(empID, empName, DateHired, BirthDate);
    }
    

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    
    public double computeSalary(){
        if (this.totalSales < 50000){
            return 0.5 * this.totalSales;
        } else if (this.totalSales >= 50000 && this.totalSales < 100000){
            return 0.20 * this.totalSales;
        } else if (this.totalSales >= 100000 && this.totalSales < 500000){
            return 0.30 * this.totalSales;
        } else {
            return 0.50 * this.totalSales;
        }
    }
    
    public void displayInfo(double salary){
        System.out.println("Employee ID: " + super.getEmpID());
        System.out.println("Employee Name: " + super.getEmpName());
        System.out.println("Date Hired: " + super.empHiredDate.getEmpHiredDate());
        System.out.println("Birth Date: " + super.empBirthDate.getEmpBirthDate());
        System.out.println("Total Sales: " + this.totalSales);
        System.out.println("Salary: " + salary);
    }

}
