/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author S542000
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList list = new ArrayList();
        Loan loan = new Loan("Naveen",2500,12.5);
        Date date = new Date();
        Circle circle = new Circle(2.5,8.9,"big circle");
        String string = new String("Naveen it's a string");
        list.add(loan);
        list.add(date);
        list.add(circle);
        list.add(string);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
    
}
