/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S542000
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void removeDuplicate(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    list.remove(j);
                    j--;
                }
            }
        }
        String listString = list.toString().replace(",", "").replace("[", "").replace("]", "").trim();
        System.out.println("The distinct integers are "+listString);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter ten integers: ");
        for(int i=0;i<10;i++){
            list.add(scan.nextInt());
        }
        removeDuplicate(list);
    } 
    
}
