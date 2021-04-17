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
public class Main8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Office office = new Office("Raja",12); it cannot be intiated because it's a abstract class
        SecretClass sc = new SecretClass("Naveen",80,10.30);
        System.out.println(sc);
    }
    
}
