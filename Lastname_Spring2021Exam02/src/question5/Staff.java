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
public class Staff extends Employee {
    private String title;

    public Staff(String title, String office, double salary, String dateHiered, String name, String address, String phoneNumber, String emailId) {
        super(office, salary, dateHiered, name, address, phoneNumber, emailId);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return " Class Name: " + this.getClass().getSimpleName() + ", Name: "+this.getName();
    }
    
}
