/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author S542000
 */
public class DevelopmentLand {
    private boolean typeOfLand;
    private double sides;
    private String nameOfLand = "Development Land";

    public DevelopmentLand(boolean typeOfLand, double sides) {
        this.typeOfLand = typeOfLand;
        this.sides = sides;
        this.type();
    }

    public boolean isTypeOfLand() {
        return typeOfLand;
    }

    public double getSides() {
        return sides;
    }

    public String getNameOfLand() {
        return nameOfLand;
    }

    public void setTypeOfLand(boolean typeOfLand) {
        this.typeOfLand = typeOfLand;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public void setNameOfLand(String nameOfLand) {
        this.nameOfLand = nameOfLand;
    }
    
    public void type(){
        if(typeOfLand = true){
            nameOfLand = "Agriculture Land";
        }
    }
    
    public double area(){
        return Math.pow(sides,2);
    }
    
    public String toString(){
        return "This is "+this.getNameOfLand()+" and area is "+this.area();
    }
}
