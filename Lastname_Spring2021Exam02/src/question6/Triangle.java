/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author S542000
 */
public class Triangle extends GeometricObject {
    private double length;
    private double height;
    private double width;
    private String color;
    private boolean fill;

    public Triangle(double length, double height, double width, String color, boolean fill) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.color = color;
        this.fill = fill;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    @Override
    public double perimeter() {
        return (this.getHeight()+this.getLength()+this.getWidth());
    }
    
    @Override
    public double area() {
        double s = this.perimeter()/2;
        return Math.sqrt(s*(s-this.getHeight())*(s-this.getLength())*(s-this.getWidth())); 
    }
    
}
