/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author S542000
 */
public class Men extends Person {

    /**
     * @param args the command line arguments
     */
    
    public void print(){
        System.out.println("This is Men non static class");
    }
    public static void printStatic(){
        System.out.println("This is Men static class");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Person men = new Men();
        Person person = new Person();
        person.print();
        men.print();
        person.printStatic();
        men.printStatic();
        
    }
    
}
