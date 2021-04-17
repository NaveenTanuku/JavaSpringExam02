/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author S542000
 */
public class Student extends Person {
    private String grade;
    private static final String CLASS_STATUS = "Graduate";

    public Student(String grade, String name, String address, String phoneNumber, String emailId) {
        super(name, address, phoneNumber, emailId);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public static String getCLASS_STATUS() {
        return CLASS_STATUS;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return " Class Name: " + this.getClass().getSimpleName() + ", Name: "+this.getName();
    }
    
}
