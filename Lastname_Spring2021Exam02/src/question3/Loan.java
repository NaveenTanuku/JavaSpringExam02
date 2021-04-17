/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author S542000
 */
public class Loan {
    private String name;
    private double amount;
    private double interestRate;

    public Loan(String name, double amount, double interestRate) {
        this.name = name;
        this.amount = amount;
        this.interestRate = interestRate;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Loan{" + "name=" + name + ", amount=" + amount + ", interestRate=" + interestRate + '}';
    }
    
}
