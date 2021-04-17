/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author S542000
 */
public class Main6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the three sides");
        double l = scan.nextDouble();
        double h = scan.nextDouble();
        double w = scan.nextDouble();
        System.out.println("Enter the color");
        String c = scan.next();
        System.out.println("Enter true or false to know the circle is filled or not");
        boolean f = scan.nextBoolean();
        Triangle triangle = new Triangle(l,h,w,c,f);
        System.out.println("Perimeter of triangle is: "+triangle.perimeter());
        System.out.println("Area of triangle is: "+String.format("%.2f", triangle.area()));   
        System.out.println("Color is: "+triangle.getColor());
        if(f){
            System.out.println("Cirlce is filled");
        }
        else{
            System.out.println("Cirlce is not filled");
        }
    }
    
}
