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
public class SecretClass extends Office {
    private double hrRate;

    public SecretClass(String Empname, double noOfHoursWorked, double hrRate) {
        super(Empname, noOfHoursWorked);
        this.hrRate = hrRate;
    }

    public double getHrRate() {
        return hrRate;
    }

    public void setHrRate(double hrRate) {
        this.hrRate = hrRate;
    }
    
    public double calcSalary(){
        return this.getHrRate()*super.getNoOfHoursWorked();
    }
    
    public double calcBonus(){
        return super.getNoOfHoursWorked()*10;
    }

    @Override
    public String toString() {
        return "Name is: "+ this.getEmpname()+"\nThe salary is: "+this.calcSalary();
    }
    
    
}
