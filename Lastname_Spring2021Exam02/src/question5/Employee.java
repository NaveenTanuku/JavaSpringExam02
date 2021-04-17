/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.time.LocalDate;

/**
 *
 * @author S542000
 */
public class Employee extends Person {
    private String office;
    private double salary;
    private String dateHiered;

    public Employee(String office, double salary, String dateHiered, String name, String address, String phoneNumber, String emailId) {
        super(name, address, phoneNumber, emailId);
        this.office = office;
        this.salary = salary;
        this.dateHiered = dateHiered;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public String getDateHiered() {
        return dateHiered;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHiered(String dateHiered) {
        this.dateHiered = dateHiered;
    }

    @Override
    public String toString() {
        return " Class Name: " + this.getClass().getSimpleName() + ", Name: "+this.getName();
    }
    
}
