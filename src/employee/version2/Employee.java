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
public class Employee {
    private int empID;
    private String empName;
    EmployeeDate empBirthDate = new EmployeeDate();
    EmployeeDate empHiredDate = new EmployeeDate();

    public Employee() {
    }
    
    /**
     *
     * @param empName
     * @param BirthDate
     */
    public Employee(String empName, String BirthDate) {
        this.empName = empName;
        empBirthDate.arrangeBirthDate(BirthDate);
    }

    public Employee(int empID, String empName, String DateHired, String BirthDate) {
        this.empID = empID;
        this.empName = empName;
        empBirthDate.arrangeBirthDate(BirthDate);
        empHiredDate.arrangeHiredDate(DateHired);
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public EmployeeDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(EmployeeDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public EmployeeDate getEmpHiredDate() {
        return empHiredDate;
    }

    public void setEmpHiredDate(EmployeeDate empHiredDate) {
        this.empHiredDate = empHiredDate;
    }
    
    
}
