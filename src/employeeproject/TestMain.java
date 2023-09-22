/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproject;
//import employee.version1.*;
import employee.version2.*;


/**
 *
 * @author User
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date emp1BD = new Date(02 , 10, 2003);
        Date emp1DH = new Date(10 , 10, 2020);
        HourlyEmployee employee1 = new HourlyEmployee(12, "Ralph Mandigma", emp1BD, emp1DH, 35, 76.25F);

        Date emp2BD = new Date(01, 12, 2011);
        Date emp2DH = new Date(02, 02, 2022);
        PieceWorkerEmployee employee2 = new PieceWorkerEmployee(14, "Miguel Mandigma", emp2BD, emp2DH,200, 76.25F);

        Date emp3BD = new Date(02, 7, 2001);
        Date emp3DH = new Date(03, 05, 2023);
        CommissionEmployee employee3 = new CommissionEmployee(16, "Rapahel Dela Rosa", emp3BD, emp3DH,12500);

        Date emp4BD = new Date(02, 05, 2011);
        Date emp4DH = new Date(06, 04, 2015);
        BasePlusCommisionEmployee employee4 = new BasePlusCommisionEmployee(16, "Michael Dela Rosa", emp4BD, emp4DH, 5000, 12000);

        double salaryOfEmployee1 = employee1.computeSalary();
        double salaryOfEmployee2 = employee2.computeSalary();
        double salaryOfEmployee3 = employee3.computeSalary();
        double salaryOfEmployee4 = employee4.computeSalary();

        System.out.println(employee1.getEmpName() + " Salary is: " + salaryOfEmployee1);
        employee1.displayInfo(salaryOfEmployee1);
        System.out.printf("\n");

        System.out.println(employee2.getEmpName() + " Salary is: " + salaryOfEmployee2);
        employee2.displayInfo(salaryOfEmployee2);
        System.out.printf("\n");

        System.out.println(employee3.getEmpName() + " Salary is: " + salaryOfEmployee3);
        employee3.displayInfo(salaryOfEmployee3);
        System.out.printf("\n");

        System.out.println(employee4.getEmpName() + " Salary is: " + salaryOfEmployee4);
        employee4.displayInfo(salaryOfEmployee4);
        System.out.printf("\n");
        
    }
}
