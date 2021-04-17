/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author S542000
 */
public abstract class Office {
    private String Empname;
    private double noOfHoursWorked;

    public Office(String Empname, double noOfHoursWorked) {
        this.Empname = Empname;
        this.noOfHoursWorked = noOfHoursWorked;
    }

    public String getEmpname() {
        return Empname;
    }

    public double getNoOfHoursWorked() {
        return noOfHoursWorked;
    }

    public void setEmpname(String Empname) {
        this.Empname = Empname;
    }

    public void setNoOfHoursWorked(double noOfHoursWorked) {
        this.noOfHoursWorked = noOfHoursWorked;
    }
    
    public abstract double calcSalary();
    public abstract double calcBonus();
    
     @Override
    public String toString() {
        return "Office{" + "Empname=" + Empname + ", noOfHoursWorked=" + noOfHoursWorked + '}';
    }
}
