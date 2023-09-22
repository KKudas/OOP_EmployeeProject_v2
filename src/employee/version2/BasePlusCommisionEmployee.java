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
public class BasePlusCommisionEmployee extends CommissionEmployee{
    private double baseSalary;
    
    
    //3 constructor
    public BasePlusCommisionEmployee() {
    }

    public BasePlusCommisionEmployee(String empName, String BirthDate) {
        super(empName, BirthDate);
    }

    public BasePlusCommisionEmployee(int empID, String empName, String DateHired, String BirthDate, double baseSalary, double totalSales) {
        super(empID, empName, DateHired, BirthDate, totalSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    
    @Override
    public double computeSalary(){
        if (super.getTotalSales() < 50000){
            return (0.5 * super.getTotalSales()) + this.baseSalary;
            
        } else if (super.getTotalSales() >= 50000 && super.getTotalSales() < 100000){
            return (0.20 * super.getTotalSales()) + this.baseSalary;
            
        } else if (super.getTotalSales() >= 100000 && super.getTotalSales() < 500000){
            return (0.30 * super.getTotalSales()) + this.baseSalary;
            
        } else {
            return (0.50 * super.getTotalSales()) + this.baseSalary;
        }
    }


    public void displayInfo(double salary){
        System.out.println("Employee ID: " + super.getEmpID());
        System.out.println("Employee Name: " + super.getEmpName());
        System.out.println("Date Hired: " + super.empHiredDate.getEmpHiredDate());
        System.out.println("Birth Date: " + super.empBirthDate.getEmpBirthDate());
        System.out.println("Total Salary: " + super.getTotalSales());
        System.out.println("Base Salary: " + this.baseSalary);
        System.out.println("Salary: " + salary);
    }

    
}
